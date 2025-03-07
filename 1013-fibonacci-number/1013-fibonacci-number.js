/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    var fn1 = fib(n-1);
    var fn2 = fib(n-2);
    var res = fn1 + fn2;
    return res;
};