/**
 * Created by zha on 2018/12/21.
 */
/*
暂时性死区（temporal dead zone，简称 TDZ）
    ES6 明确规定，如果区块中存在let和const命令，这个区块对这些命令声明的变量，从一开始就形成了封闭作用域。凡是在声明之前就使用这些变量，就会报错。
 */

// var tmp = 123;
//
// if (true) {
//     tmp = 'abc'; // ReferenceError
//     let tmp;
// }


// typeof x; // ReferenceError
// let x;


var s = typeof y;
console.log(s);