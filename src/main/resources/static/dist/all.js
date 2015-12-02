"use strict";

var _createClass = (function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; })();

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

var Main = (function () {
    function Main(elTarget, htOption) {
        _classCallCheck(this, Main);

        this.elTarget = elTarget;
        this.init(htOption);
    }

    _createClass(Main, [{
        key: "init",
        value: function init(htOption) {
            console.log('test');
            console.log("ttestdf");
            this.sendDebugger();
        }
    }, {
        key: "sendDebugger",
        value: function sendDebugger() {
            debugger;
        }
    }]);

    return Main;
})();
//# sourceMappingURL=all.js.map
