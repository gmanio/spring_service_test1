module.exports = function (grunt) {
    // Configure grunt
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        path:{
            spriteRoot:"sp"
        },
        sprite:{
            all: {
                src: 'sp/*.png',
                dest: 'img/sprite.png',
                destCss: 'css/sprites.css'
            }
        },
        watch:{
            sprite: {
                files: ['<%= path.spriteRoot %>/*.png'],
                tasks: ['sprite']
            }
        }
    });

    // Load in `grunt-spritesmith`
    grunt.loadNpmTasks('grunt-spritesmith');
    grunt.loadNpmTasks('grunt-contrib-watch');

    grunt.task.registerTask('default', 'watch');
};