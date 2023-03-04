package com.example.feature_space.domain.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001:\u0002/0BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\fH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003Ji\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00061"}, d2 = {"Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse;", "", "spaceMemberId", "", "spaceId", "personId", "userDetails", "Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$UserDetails;", "inviteId", "lastUpdated", "", "joined", "", "spaceDetailsResponse", "Lcom/example/feature_space/domain/model/response/SpaceDetailsResponse;", "inviteDetails", "Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$InviteDetails;", "(IIILcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$UserDetails;ILjava/lang/String;ZLcom/example/feature_space/domain/model/response/SpaceDetailsResponse;Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$InviteDetails;)V", "getInviteDetails", "()Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$InviteDetails;", "getInviteId", "()I", "getJoined", "()Z", "getLastUpdated", "()Ljava/lang/String;", "getPersonId", "getSpaceDetailsResponse", "()Lcom/example/feature_space/domain/model/response/SpaceDetailsResponse;", "getSpaceId", "getSpaceMemberId", "getUserDetails", "()Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$UserDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "InviteDetails", "UserDetails", "feature_space_debug"})
public final class SingleSpaceMemberResponse {
    private final int spaceMemberId = 0;
    private final int spaceId = 0;
    private final int personId = 0;
    @org.jetbrains.annotations.Nullable
    private final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails userDetails = null;
    private final int inviteId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastUpdated = null;
    private final boolean joined = false;
    @org.jetbrains.annotations.Nullable
    private final com.example.feature_space.domain.model.response.SpaceDetailsResponse spaceDetailsResponse = null;
    @org.jetbrains.annotations.Nullable
    private final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails inviteDetails = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse copy(int spaceMemberId, int spaceId, int personId, @org.jetbrains.annotations.Nullable
    com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails userDetails, int inviteId, @org.jetbrains.annotations.NotNull
    java.lang.String lastUpdated, boolean joined, @org.jetbrains.annotations.Nullable
    com.example.feature_space.domain.model.response.SpaceDetailsResponse spaceDetailsResponse, @org.jetbrains.annotations.Nullable
    com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails inviteDetails) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public SingleSpaceMemberResponse(int spaceMemberId, int spaceId, int personId, @org.jetbrains.annotations.Nullable
    com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails userDetails, int inviteId, @org.jetbrains.annotations.NotNull
    java.lang.String lastUpdated, boolean joined, @org.jetbrains.annotations.Nullable
    com.example.feature_space.domain.model.response.SpaceDetailsResponse spaceDetailsResponse, @org.jetbrains.annotations.Nullable
    com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails inviteDetails) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getSpaceMemberId() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getSpaceId() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPersonId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails getUserDetails() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getInviteId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getJoined() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_space.domain.model.response.SpaceDetailsResponse component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_space.domain.model.response.SpaceDetailsResponse getSpaceDetailsResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails getInviteDetails() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$UserDetails;", "", "phoneNo", "", "username", "userId", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getPhoneNo", "()Ljava/lang/String;", "getUserId", "()I", "getUsername", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature_space_debug"})
    public static final class UserDetails {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String phoneNo = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String username = null;
        private final int userId = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails copy(@org.jetbrains.annotations.NotNull
        java.lang.String phoneNo, @org.jetbrains.annotations.NotNull
        java.lang.String username, int userId) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public UserDetails(@org.jetbrains.annotations.NotNull
        java.lang.String phoneNo, @org.jetbrains.annotations.NotNull
        java.lang.String username, int userId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPhoneNo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUsername() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getUserId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$InviteDetails;", "", "inviteID", "", "spaceId", "phoneNo", "", "inviteName", "lastUpdated", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInviteID", "()I", "getInviteName", "()Ljava/lang/String;", "getLastUpdated", "getPhoneNo", "getSpaceId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "feature_space_debug"})
    public static final class InviteDetails {
        private final int inviteID = 0;
        private final int spaceId = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String phoneNo = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String inviteName = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String lastUpdated = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails copy(int inviteID, int spaceId, @org.jetbrains.annotations.NotNull
        java.lang.String phoneNo, @org.jetbrains.annotations.NotNull
        java.lang.String inviteName, @org.jetbrains.annotations.NotNull
        java.lang.String lastUpdated) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public InviteDetails(int inviteID, int spaceId, @org.jetbrains.annotations.NotNull
        java.lang.String phoneNo, @org.jetbrains.annotations.NotNull
        java.lang.String inviteName, @org.jetbrains.annotations.NotNull
        java.lang.String lastUpdated) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getInviteID() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getSpaceId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPhoneNo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getInviteName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLastUpdated() {
            return null;
        }
    }
}