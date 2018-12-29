RetrofitLivedataCallAdapter
===========================
   - The Retrofit's callAdapter for LiveData
   - A Develop-Project ,may be have bugs.

HOW TO USE IT?
--------------

  1. In module's build.gradle
  ````
  implementation "com.aqrlei.opensource:retrofitlivedatacalladapter:latestVersion"
  ````
  2. Retrofit.Builder()
  ````
    Retrofit.Builder()
              .addCallAdapterFactory(LiveDataCallAdapterFactory.create())
              .addConverterFactory(LiveDataConverterFactory.create())
              ...
  ````
  3.  The response data body
  ````
  LiveObservable<LiveResponse<your response data body>>
  ````
  4. Observe
  ````
  //container is LifecycleOwner
  liveObservable.observe(lifecycleOwner,{your action })

  //container is not LifecycleOwner
  liveObservable.observe({your action})
  or
  LiveObservable.observe(mediatorLiveData,{your action})
    ````

