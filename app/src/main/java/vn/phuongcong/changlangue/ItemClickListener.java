package vn.phuongcong.changlangue;

/**
 * Created by Ominext on 11/30/2017.
 */

public interface ItemClickListener<T> {
    void onClickItem(int position, T item);
}