package sadaharusong.github.com.databaselistener;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/**
 * Created by sadaharusong on 2017/8/5 0005.
 * Github : https://github.com/sadaharusong
 * Email : jacksomangel@163.com
 */

public class DataBaseListener {
    private Context mContext;
    private onDataBaseListener mListener;

    private ContentObserver cob = new ContentObserver(new Handler()) {
        @Override
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            mListener.onDataBaseChange();
        }
    };

    /**
     * @param uri The URI of the database to listen
     */
    DataBaseListener(Context context, Uri uri){
        this.mContext = context;
        context.getContentResolver().registerContentObserver(uri,true,cob);
    }

    public void setOnDataBaseListener(onDataBaseListener listener){
        this.mListener = listener;
    }

    public void removeOnDataBaseListener(){
        mContext.getContentResolver().unregisterContentObserver(cob);
    }

    public interface onDataBaseListener{
       void onDataBaseChange();
    }
}
