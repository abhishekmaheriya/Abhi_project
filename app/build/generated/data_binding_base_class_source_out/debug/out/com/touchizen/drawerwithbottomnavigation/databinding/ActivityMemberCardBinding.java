// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.touchizen.drawerwithbottomnavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMemberCardBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView c1;

  @NonNull
  public final CardView c2;

  @NonNull
  public final LinearLayout l1;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final RecyclerView rvn;

  @NonNull
  public final Toolbar toolbarSearch;

  private ActivityMemberCardBinding(@NonNull RelativeLayout rootView, @NonNull CardView c1,
      @NonNull CardView c2, @NonNull LinearLayout l1, @NonNull AppBarLayout layoutmain,
      @NonNull RecyclerView rvn, @NonNull Toolbar toolbarSearch) {
    this.rootView = rootView;
    this.c1 = c1;
    this.c2 = c2;
    this.l1 = l1;
    this.layoutmain = layoutmain;
    this.rvn = rvn;
    this.toolbarSearch = toolbarSearch;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMemberCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMemberCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_member_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMemberCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.c1;
      CardView c1 = rootView.findViewById(id);
      if (c1 == null) {
        break missingId;
      }

      id = R.id.c2;
      CardView c2 = rootView.findViewById(id);
      if (c2 == null) {
        break missingId;
      }

      id = R.id.l1;
      LinearLayout l1 = rootView.findViewById(id);
      if (l1 == null) {
        break missingId;
      }

      id = R.id.layoutmain;
      AppBarLayout layoutmain = rootView.findViewById(id);
      if (layoutmain == null) {
        break missingId;
      }

      id = R.id.rvn;
      RecyclerView rvn = rootView.findViewById(id);
      if (rvn == null) {
        break missingId;
      }

      id = R.id.toolbar_search;
      Toolbar toolbarSearch = rootView.findViewById(id);
      if (toolbarSearch == null) {
        break missingId;
      }

      return new ActivityMemberCardBinding((RelativeLayout) rootView, c1, c2, l1, layoutmain, rvn,
          toolbarSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
