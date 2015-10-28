package com.jing.rxjava;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by jingdongqi on 10/28/15.
 */
public class HelloWorld {
    public static void main(String[] args) {

        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {


            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello rxjava");
                subscriber.onCompleted();


            }
        });


        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {

                System.out.println(s);

            }
        };


        observable.subscribe(subscriber);


    }


}
