package com.ld.helloservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class HelloService extends Service {

	int mStartMode;
	IBinder mBinder;
	boolean mAllowRebind;
	
	@Override
	public IBinder onBind(Intent arg0) {
		return mBinder;
	}

	@Override
	public void onCreate() {
	}

	@Override
	public void onDestroy() {
	}

	@Override
	public void onRebind(Intent intent) {
	}


	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		return mStartMode;
	}

	@Override
	public boolean onUnbind(Intent intent) {
		return mAllowRebind;
	}
	
	

}
