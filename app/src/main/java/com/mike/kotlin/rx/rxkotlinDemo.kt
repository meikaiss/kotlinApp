package com.mike.kotlin.rx

import rx.Observable
import rx.Observer
import rx.Scheduler
import rx.functions.Func1
import rx.schedulers.Schedulers
import java.util.*

/**
 * Created by meikai on 2019/12/19.
 */
class rxkotlinDemo {


    fun test0(){
        val observable = Observable.just(1,2,3,4,5, 6, 7, 8, 9)
                .map(object : Func1<Int, String> {
                    override fun call(t: Int): String {
                        return "数值="+t
                    }

                })
                .flatMap(object : Func1<String, Observable<String>> {

                    override fun call(t: String): Observable<String> {

                        var result = ""
                        t.forEach {
                            result += it
                        }

                        return Observable.just(result)
                    }

                })
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<String> {
                    override fun onNext(t: String?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onCompleted() {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onError(e: Throwable?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }
                })
    }

    fun test(){
        val observable = Observable.just(1,2,3,4,5, 6, 7, 8, 9)
                .map(object : Func1<Int, String> {
                    override fun call(t: Int): String {
                        return "数值="+t
                    }

                })
                .buffer(3)
                .flatMap(object : Func1<List<String>, Observable<String>> {

                    override fun call(t: List<String>): Observable<String> {

                        var result = ""
                        t.forEach {
                            result += it
                        }

                        return Observable.just(result)
                    }

                })
                .subscribeOn(Schedulers.io())
                .subscribe(object : Observer<String> {
                    override fun onNext(t: String?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onCompleted() {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onError(e: Throwable?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }
                })
    }

}