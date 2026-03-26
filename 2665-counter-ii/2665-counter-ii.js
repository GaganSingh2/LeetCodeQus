/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let presentCnt = init

    function increment(){
        return ++presentCnt
    }
    function decrement(){
        return --presentCnt
    }
    function reset(){
        return presentCnt = init
    }
    return {increment, decrement, reset}
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */