var gulp = require('gulp');
var less = require('gulp-less');
var path = require('path');
var minifycss  = require('gulp-minify-css');

var src = {
    js: './src/js/*.js',
    less: './src/less/**/*.less',
};
var dist = {
    js: './public/js/',
    css: './public/css/'
};


gulp.task('less', function () {
    return gulp.src(src.less)
        .pipe(less({
            paths: [ path.join(__dirname, 'less', 'includes') ]
        }))
        .pipe(minifycss())
        .pipe(gulp.dest(dist.css));
});


gulp.task('watch', function() {
    gulp.watch(src.less, ['less']);
});