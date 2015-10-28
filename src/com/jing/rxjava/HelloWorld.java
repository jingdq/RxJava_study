package com.jing.rxjava;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Created by jimi on 10/28/15.
 */
public class HelloWorld {
    public static void main(String[] args) {

//        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
//
//
//            @Override
//            public void call(Subscriber<? super String> subscriber) {
//                subscriber.onNext("Hello rxjava");
//                subscriber.onCompleted();
//
//
//            }
//        });
//
//
//        Subscriber<String> subscriber = new Subscriber<String>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable throwable) {
//
//            }
//
//            @Override
//            public void onNext(String s) {
//
//                System.out.println(s);
//
//            }
//        };
//
//
//        observable.subscribe(subscriber);


//        Observable<String> observable = Observable.just("Hello Rxjava");
//
//
//        Action1<String> subscriber = new Action1<String>() {
//            @Override
//            public void call(String s) {
//                System.out.println(s);
//            }
//        };
//
//        observable.subscribe(subscriber);


        Observable.just("hello rxjava").subscribe(s->System.out.println(s));

    }


}
