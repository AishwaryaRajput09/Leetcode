/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var res = [];
    for(var i = 0; i < arr.length; i++){
        res.push(fn(arr[i],i,arr));
    }
    return res;
};