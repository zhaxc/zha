/**
 * Created by java on 2017/4/19.
 */

var map = function() {
    var category;
    if(this.name.contains('J')) {
        category = 'IJ';
    }else{
        category = 'NJ';
    }
    emit(category,{name:this.name});
};


var reduce = function (key, values) {
    var sum = 0;
    values.forEach(function (value, index, array) {
        sum += value.name;
        sum += ',';
    });
    return sum.substr(0,sum.length-1);
};

