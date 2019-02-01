/**
 * Created by zha on 2018/12/21.
 */

/*
 let

 基本用法

 ES6 新增了let命令，用来声明变量。它的用法类似于var，但是所声明的变量，只在let命令所在的代码块内有效。

 */
'use strict';// 严格模式运行JavaScript代码
// {
//     let a = 10;
//     var b = 1;
// }
//
// console.log(b);
// console.log(a); //ReferenceError: a is not defined.

//for循环的计数器，就很合适使用let命令。
// for (let i = 0; i < 10; i++) {
//     console.log(i);
// }


// var a = [];
// for (var i = 0; i < 10; i++) {
//     a[i] = function () {
//         console.log(i);
//     };
// }
// a[6]();//10

var a = [];
for (let i=0;i<10;i++) {
    a[i] = function () {
        console.log(i);
    };
}

a[6]();//6


//函数内部的变量i与循环变量i不在同一个作用域，有各自单独的作用域
for (let i = 0; i < 3; i++) {
    let i = 'abc';
    console.log(i);
}


//let 不存在变量提升

// var 的情况
console.log(foo); // 输出undefined
var foo = 2;

// let 的情况
console.log(bar); // 报错ReferenceError
let bar = 2;