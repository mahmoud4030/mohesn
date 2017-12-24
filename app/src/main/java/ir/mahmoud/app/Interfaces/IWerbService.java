package ir.mahmoud.app.Interfaces;


import android.widget.LinearLayout;

import java.util.List;

import ir.mahmoud.app.Models.PostModel;

public interface IWerbService {

    void getResult(List<PostModel> feed, LinearLayout ll) throws Exception;

    void getError(String ErrorCodeTitle) throws Exception;
}
