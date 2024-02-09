/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    // const reduced = [];
    let acc = init === undefined ? nums[0] : init;
    for(let i = init === undefined ? 1 : 0; i < nums.length; i++){
       acc = fn(acc,nums[i],i,nums);
    }
    return acc;
};