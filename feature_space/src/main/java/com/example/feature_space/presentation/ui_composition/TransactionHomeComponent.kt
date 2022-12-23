package com.example.feature_space.presentation.ui_composition

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.design.PopText
import com.example.feature_space.R

@Composable
fun TransactionHomeComponent(
    txnName: String = "",
    userName: String = "",
    txnAmount: String = "",
    txnDate: String = "",
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.padding(10.dp),
        shape = RoundedCornerShape(6.dp),
        elevation = 6.dp
    ) {
        ConstraintLayout(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            val (icon, transactionName, transactionDescription, price, date) = createRefs()

            Image(
                painter = painterResource(id = R.drawable.trx_in),
                contentDescription = "",
                modifier = Modifier.width(40.dp).height(40.dp).constrainAs(icon) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    bottom.linkTo(parent.bottom)
                }
            )

            PopText(
                text = txnName,
                modifier = Modifier.padding(horizontal = 10.dp).constrainAs(transactionName) {
                    top.linkTo(parent.top)
                    start.linkTo(icon.end)
                }
            )

            PopText(
                text = userName,
                modifier = Modifier.padding(horizontal = 10.dp).constrainAs(transactionDescription) {
                    top.linkTo(transactionName.bottom)
                    start.linkTo(icon.end)
                }
            )

            PopText(
                text = txnAmount,
                modifier = Modifier.constrainAs(price) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                }
            )

            PopText(
                text = txnDate,
                modifier = Modifier.constrainAs(date) {
                    top.linkTo(price.bottom)
                    end.linkTo(parent.end)
                }
            )
        }
    }
}
