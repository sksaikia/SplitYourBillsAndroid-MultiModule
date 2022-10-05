package com.example.design

import androidx.compose.animation.Animatable
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Composable
fun UnifySwipeButton(
    onSwiped: () -> Unit,
    modifier: Modifier = Modifier,
    swipeButtonState: SwipeButtonState,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = RoundedCornerShape(20.0.dp),
    // Missed attribute elevation
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    icon: ImageVector = Icons.Default.ArrowForward,
    rotateIcon: Boolean = true,
    iconPadding: PaddingValues = PaddingValues(2.dp),
    content: @Composable RowScope.() -> Unit
) {
    val contentColor by colors.contentColor(enabled)
    val dragOffset = remember {
        mutableStateOf(0f)
    }

    val collapsed = swipeButtonState == SwipeButtonState.COLLAPSED
    val swiped = swipeButtonState == SwipeButtonState.SWIPED

    Surface(
        modifier = modifier,
        shape = shape,
        // Changes made
        color = colors.backgroundColor(enabled).value,
        contentColor = contentColor.copy(alpha = 1f),
        border = border
    )
    // Missed shadowElevation and tonalElevation)
    {
        BoxWithConstraints(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.CenterStart
        ) {
            val maxWidth = this.constraints.maxWidth.toFloat()

            when {
                collapsed -> {
                    val animatedProgress = remember {
                        androidx.compose.animation.core.Animatable(initialValue = 0f)
                    }
                    LaunchedEffect(Unit) {
                        animatedProgress.animateTo(
                            targetValue = 1f,
                            animationSpec = tween(600)
                        )
                    }

                    IconButton(
                        onClick = { },
                        modifier = Modifier
                            .scale(animatedProgress.value)
                            .padding(iconPadding)
                            .clip(CircleShape)
                            .background(MaterialTheme.colors.onPrimary)
                            .align(Alignment.Center)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Done,
                            contentDescription = "Done",
                            tint = MaterialTheme.colors.primary
                        )
                    }
                }
                swiped -> {
                    UnifyHorizontalDottedProgressBar()
                }
                else -> {
                    dragOffset.value = 0f
                    CompositionLocalProvider(LocalContentAlpha provides contentColor.alpha) {
                        ProvideTextStyle(value = MaterialTheme.typography.body1) {
                            Row(
                                modifier = Modifier.fillMaxSize().padding(contentPadding),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically,
                                content = content
                            )
                        }
                    }
                }
            }

            // Swipe Component
            AnimatedVisibility(visible = !swiped) {
                IconButton(
                    onClick = { },
                    enabled = enabled,
                    modifier = Modifier
                        .padding(iconPadding)
                        .align(Alignment.CenterStart)
                        .offset { IntOffset(dragOffset.value.roundToInt(), 0) }
                        .draggable(
                            enabled = enabled,
                            orientation = Orientation.Horizontal,
                            state = rememberDraggableState { delta ->
                                val newValue = dragOffset.value + delta
                                dragOffset.value = newValue.coerceIn(0f, maxWidth)
                            },
                            onDragStopped = {
                                if (dragOffset.value > maxWidth * 2 / 3) {
                                    dragOffset.value = maxWidth
                                    onSwiped.invoke()
                                } else {
                                    dragOffset.value = 0f
                                }
                            }
                        )
                        .background(MaterialTheme.colors.onPrimary, shape = CircleShape)
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = "Arrow",
                        modifier = Modifier.graphicsLayer { if (rotateIcon) {
                            rotationZ += dragOffset.value / 5
                        }
                        },
                        tint = colors.backgroundColor(enabled = enabled).value
                    )
                }
            }
        }
    }
}
enum class SwipeButtonState {
    INITIAL, SWIPED, COLLAPSED
}
