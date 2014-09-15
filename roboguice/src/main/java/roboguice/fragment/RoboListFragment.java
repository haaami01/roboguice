package roboguice.fragment;

import roboguice.RoboGuice;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

/**
 * Provides an injected {@link ListFragment} based on support library v4.
 * A RoboListFragment will see all its members and views injected after {@link #onViewCreated(View, Bundle)}. 
 * @author Michael Burton
 */
public abstract class RoboListFragment extends ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RoboGuice.getInjector(getActivity()).injectMembersWithoutViews(this);
    }
}
