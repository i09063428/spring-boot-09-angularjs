/**
 * Created by zxl16 on 2019/10/8.
 */
actionApp.directive('datePicker',function () {
    return {
        restrict:'AC',
        link:function (scope,elem,attrs) {
            elem.datepicker();
        }
    };
});
