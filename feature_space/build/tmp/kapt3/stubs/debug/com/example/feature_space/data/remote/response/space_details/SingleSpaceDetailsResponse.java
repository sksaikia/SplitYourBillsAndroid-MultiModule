package com.example.feature_space.data.remote.response.space_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse;", "", "success", "", "spacesResponse", "Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail;", "(ZLcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail;)V", "getSpacesResponse", "()Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "SingleSpaceDetail", "feature_space_debug"})
public final class SingleSpaceDetailsResponse {
    @com.google.gson.annotations.SerializedName(value = "success")
    private final boolean success = false;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "data")
    private final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail spacesResponse = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse copy(boolean success, @org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail spacesResponse) {
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
    
    public SingleSpaceDetailsResponse(boolean success, @org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail spacesResponse) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail getSpacesResponse() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail;", "", "spaceId", "", "personId", "spaceName", "", "spaceDescription", "lastUpdated", "active", "", "userResponse", "Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail$UserResponse;", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail$UserResponse;)V", "getActive", "()Z", "getLastUpdated", "()Ljava/lang/String;", "getPersonId", "()J", "getSpaceDescription", "getSpaceId", "getSpaceName", "getUserResponse", "()Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail$UserResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "UserResponse", "feature_space_debug"})
    public static final class SingleSpaceDetail {
        @com.google.gson.annotations.SerializedName(value = "spaceId")
        private final long spaceId = 0L;
        @com.google.gson.annotations.SerializedName(value = "personId")
        private final long personId = 0L;
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "spaceName")
        private final java.lang.String spaceName = null;
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "spaceDescription")
        private final java.lang.String spaceDescription = null;
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "lastUpdated")
        private final java.lang.String lastUpdated = null;
        @com.google.gson.annotations.SerializedName(value = "active")
        private final boolean active = false;
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "userResponse")
        private final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse userResponse = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail copy(long spaceId, long personId, @org.jetbrains.annotations.NotNull
        java.lang.String spaceName, @org.jetbrains.annotations.NotNull
        java.lang.String spaceDescription, @org.jetbrains.annotations.NotNull
        java.lang.String lastUpdated, boolean active, @org.jetbrains.annotations.NotNull
        com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse userResponse) {
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
        
        public SingleSpaceDetail(long spaceId, long personId, @org.jetbrains.annotations.NotNull
        java.lang.String spaceName, @org.jetbrains.annotations.NotNull
        java.lang.String spaceDescription, @org.jetbrains.annotations.NotNull
        java.lang.String lastUpdated, boolean active, @org.jetbrains.annotations.NotNull
        com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse userResponse) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getSpaceId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getPersonId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSpaceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSpaceDescription() {
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
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean getActive() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse getUserResponse() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail$UserResponse;", "", "phoneNo", "", "username", "userId", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getPhoneNo", "()Ljava/lang/String;", "getUserId", "()J", "getUsername", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_space_debug"})
        public static final class UserResponse {
            @org.jetbrains.annotations.NotNull
            @com.google.gson.annotations.SerializedName(value = "phoneNo")
            private final java.lang.String phoneNo = null;
            @org.jetbrains.annotations.NotNull
            @com.google.gson.annotations.SerializedName(value = "username")
            private final java.lang.String username = null;
            @com.google.gson.annotations.SerializedName(value = "userId")
            private final long userId = 0L;
            
            @org.jetbrains.annotations.NotNull
            public final com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse copy(@org.jetbrains.annotations.NotNull
            java.lang.String phoneNo, @org.jetbrains.annotations.NotNull
            java.lang.String username, long userId) {
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
            
            public UserResponse(@org.jetbrains.annotations.NotNull
            java.lang.String phoneNo, @org.jetbrains.annotations.NotNull
            java.lang.String username, long userId) {
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
            
            public final long component3() {
                return 0L;
            }
            
            public final long getUserId() {
                return 0L;
            }
        }
    }
}