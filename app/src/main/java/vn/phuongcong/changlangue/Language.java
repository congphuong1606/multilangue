package vn.phuongcong.changlangue;

/**
 * Created by Ominext on 11/30/2017.
 */

public class Language {

    private int mId;
    private String mName;
    private String mCode;

    public Language(int id, String name, String code) {
        mId = id;
        mName = name;
        mCode = code;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getCode() {
        return mCode;
    }
}
