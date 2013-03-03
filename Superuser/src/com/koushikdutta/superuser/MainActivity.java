/*
 * Copyright (C) 2013 Koushik Dutta (@koush)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.koushikdutta.superuser;

import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

import com.koushikdutta.widgets.BetterListActivity;

public class MainActivity extends BetterListActivity {
    public MainActivity() {
        super(PolicyFragment.class);
    }

    public PolicyFragmentInternal getFragment() {
        return (PolicyFragmentInternal)super.getFragment();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem about = menu.add(R.string.about);
        about.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                getFragment().setContent(new AboutFragment(), true, getString(R.string.about));
                return true;
            }
        });
        
        return super.onCreateOptionsMenu(menu);
    }
}
