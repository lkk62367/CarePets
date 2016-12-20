package will.tw.carepets;

import com.google.gson.annotations.SerializedName;

public class ItemObject {
    @SerializedName("_id")
    private String id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Sex")
    private String sex;
    @SerializedName("Type")
    private String type;
    @SerializedName("Build")
    private String build;
    @SerializedName("ImageName")
    private String imagename;

    public ItemObject(String name, String sex, String type, String imagename,String build) {
        this.name = name;
        this.sex = sex;
        this.type = type;
        this.imagename = imagename;
        this.build = build;
    }

    public String getSongTitle() {
        return name;
    }

    public String getSongYear() {
        return sex;
    }

    public String getSongAuthor() {
        return type;
    }

    public String getImagename() {
        return imagename;
    }
    public String getBuild(){
        return build;
    }

}
