package com.example.foodorder;

public class Profile2 {
    private String name;
    private String email;
    private String profilePic;
    private boolean added;

    public Profile2() {
    }

    public Profile2(String name, String email, String profilePic, boolean added) {
        this.name = name;
        this.email = email;
        this.profilePic = profilePic;
        this.added = added;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePics(String profilePics) {
        this.profilePic = profilePic;
    }

    public boolean getadded() {
        return added;
    }

    public void setadded(boolean added) {
        this.added = added;
    }
}
