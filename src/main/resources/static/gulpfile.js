var gulp = require("gulp");
var sourcemaps = require("gulp-sourcemaps");
var babel = require("gulp-babel");
var concat = require("gulp-concat");
var watch = require("gulp-watch");

var srcPath = 'js/*.js';

gulp.task("babel", function () {
    return gulp.src(srcPath)
        .pipe(sourcemaps.init())
        .pipe(babel({
            presets: ['es2015']
        }))
        .pipe(concat("all.js"))
        .pipe(sourcemaps.write("."))
        .pipe(gulp.dest("dist"));
});

gulp.task('watch', function() {
    //their could be more watchers here ofc
    gulp.watch(srcPath, ['babel'])
})