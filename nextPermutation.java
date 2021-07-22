<!DOCTYPE html>
<!-- saved from url=(0030)https://ide.geeksforgeeks.org/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style id="ace-vibrant-ink">.ace-vibrant-ink .ace_gutter {background: #1a1a1a;color: #BEBEBE}.ace-vibrant-ink .ace_print-margin {width: 1px;background: #1a1a1a}.ace-vibrant-ink {background-color: #0F0F0F;color: #FFFFFF}.ace-vibrant-ink .ace_cursor {color: #FFFFFF}.ace-vibrant-ink .ace_marker-layer .ace_selection {background: #6699CC}.ace-vibrant-ink.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px #0F0F0F;}.ace-vibrant-ink .ace_marker-layer .ace_step {background: rgb(102, 82, 0)}.ace-vibrant-ink .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid #404040}.ace-vibrant-ink .ace_marker-layer .ace_active-line {background: #333333}.ace-vibrant-ink .ace_gutter-active-line {background-color: #333333}.ace-vibrant-ink .ace_marker-layer .ace_selected-word {border: 1px solid #6699CC}.ace-vibrant-ink .ace_invisible {color: #404040}.ace-vibrant-ink .ace_keyword,.ace-vibrant-ink .ace_meta {color: #FF6600}.ace-vibrant-ink .ace_constant,.ace-vibrant-ink .ace_constant.ace_character,.ace-vibrant-ink .ace_constant.ace_character.ace_escape,.ace-vibrant-ink .ace_constant.ace_other {color: #339999}.ace-vibrant-ink .ace_constant.ace_numeric {color: #99CC99}.ace-vibrant-ink .ace_invalid,.ace-vibrant-ink .ace_invalid.ace_deprecated {color: #CCFF33;background-color: #000000}.ace-vibrant-ink .ace_fold {background-color: #FFCC00;border-color: #FFFFFF}.ace-vibrant-ink .ace_entity.ace_name.ace_function,.ace-vibrant-ink .ace_support.ace_function,.ace-vibrant-ink .ace_variable {color: #FFCC00}.ace-vibrant-ink .ace_variable.ace_parameter {font-style: italic}.ace-vibrant-ink .ace_string {color: #66FF00}.ace-vibrant-ink .ace_string.ace_regexp {color: #44B4CC}.ace-vibrant-ink .ace_comment {color: #9933CC}.ace-vibrant-ink .ace_entity.ace_other.ace_attribute-name {font-style: italic;color: #99CC99}.ace-vibrant-ink .ace_indent-guide {background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAEklEQVQImWNgYGBgYNDTc/oPAALPAZ7hxlbYAAAAAElFTkSuQmCC) right repeat-y}
/*# sourceURL=ace/css/ace-vibrant-ink */</style><style id="autocompletion.css">.ace_editor.ace_autocomplete .ace_marker-layer .ace_active-line {    background-color: #CAD6FA;    z-index: 1;}.ace_dark.ace_editor.ace_autocomplete .ace_marker-layer .ace_active-line {    background-color: #3a674e;}.ace_editor.ace_autocomplete .ace_line-hover {    border: 1px solid #abbffe;    margin-top: -1px;    background: rgba(233,233,253,0.4);    position: absolute;    z-index: 2;}.ace_dark.ace_editor.ace_autocomplete .ace_line-hover {    border: 1px solid rgba(109, 150, 13, 0.8);    background: rgba(58, 103, 78, 0.62);}.ace_completion-meta {    opacity: 0.5;    margin: 0.9em;}.ace_editor.ace_autocomplete .ace_completion-highlight{    color: #2d69c7;}.ace_dark.ace_editor.ace_autocomplete .ace_completion-highlight{    color: #93ca12;}.ace_editor.ace_autocomplete {    width: 300px;    z-index: 200000;    border: 1px lightgray solid;    position: fixed;    box-shadow: 2px 3px 5px rgba(0,0,0,.2);    line-height: 1.4;    background: #fefefe;    color: #111;}.ace_dark.ace_editor.ace_autocomplete {    border: 1px #484747 solid;    box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.51);    line-height: 1.4;    background: #25282c;    color: #c1c1c1;}
/*# sourceURL=ace/css/autocompletion.css */</style><style>.ace_snippet-marker {    -moz-box-sizing: border-box;    box-sizing: border-box;    background: rgba(194, 193, 208, 0.09);    border: 1px dotted rgba(211, 208, 235, 0.62);    position: absolute;}</style><style>    .error_widget_wrapper {        background: inherit;        color: inherit;        border:none    }    .error_widget {        border-top: solid 2px;        border-bottom: solid 2px;        margin: 5px 0;        padding: 10px 40px;        white-space: pre-wrap;    }    .error_widget.ace_error, .error_widget_arrow.ace_error{        border-color: #ff5a5a    }    .error_widget.ace_warning, .error_widget_arrow.ace_warning{        border-color: #F1D817    }    .error_widget.ace_info, .error_widget_arrow.ace_info{        border-color: #5a5a5a    }    .error_widget.ace_ok, .error_widget_arrow.ace_ok{        border-color: #5aaa5a    }    .error_widget_arrow {        position: absolute;        border: solid 5px;        border-top-color: transparent!important;        border-right-color: transparent!important;        border-left-color: transparent!important;        top: -5px;    }</style><style id="ace-tm">.ace-tm .ace_gutter {background: #f0f0f0;color: #333;}.ace-tm .ace_print-margin {width: 1px;background: #e8e8e8;}.ace-tm .ace_fold {background-color: #6B72E6;}.ace-tm {background-color: #FFFFFF;color: black;}.ace-tm .ace_cursor {color: black;}.ace-tm .ace_invisible {color: rgb(191, 191, 191);}.ace-tm .ace_storage,.ace-tm .ace_keyword {color: blue;}.ace-tm .ace_constant {color: rgb(197, 6, 11);}.ace-tm .ace_constant.ace_buildin {color: rgb(88, 72, 246);}.ace-tm .ace_constant.ace_language {color: rgb(88, 92, 246);}.ace-tm .ace_constant.ace_library {color: rgb(6, 150, 14);}.ace-tm .ace_invalid {background-color: rgba(255, 0, 0, 0.1);color: red;}.ace-tm .ace_support.ace_function {color: rgb(60, 76, 114);}.ace-tm .ace_support.ace_constant {color: rgb(6, 150, 14);}.ace-tm .ace_support.ace_type,.ace-tm .ace_support.ace_class {color: rgb(109, 121, 222);}.ace-tm .ace_keyword.ace_operator {color: rgb(104, 118, 135);}.ace-tm .ace_string {color: rgb(3, 106, 7);}.ace-tm .ace_comment {color: rgb(76, 136, 107);}.ace-tm .ace_comment.ace_doc {color: rgb(0, 102, 255);}.ace-tm .ace_comment.ace_doc.ace_tag {color: rgb(128, 159, 191);}.ace-tm .ace_constant.ace_numeric {color: rgb(0, 0, 205);}.ace-tm .ace_variable {color: rgb(49, 132, 149);}.ace-tm .ace_xml-pe {color: rgb(104, 104, 91);}.ace-tm .ace_entity.ace_name.ace_function {color: #0000A2;}.ace-tm .ace_heading {color: rgb(12, 7, 255);}.ace-tm .ace_list {color:rgb(185, 6, 144);}.ace-tm .ace_meta.ace_tag {color:rgb(0, 22, 142);}.ace-tm .ace_string.ace_regex {color: rgb(255, 0, 0)}.ace-tm .ace_marker-layer .ace_selection {background: rgb(181, 213, 255);}.ace-tm.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px white;}.ace-tm .ace_marker-layer .ace_step {background: rgb(252, 255, 0);}.ace-tm .ace_marker-layer .ace_stack {background: rgb(164, 229, 101);}.ace-tm .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid rgb(192, 192, 192);}.ace-tm .ace_marker-layer .ace_active-line {background: rgba(0, 0, 0, 0.07);}.ace-tm .ace_gutter-active-line {background-color : #dcdcdc;}.ace-tm .ace_marker-layer .ace_selected-word {background: rgb(250, 250, 255);border: 1px solid rgb(200, 200, 250);}.ace-tm .ace_indent-guide {background: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==") right repeat-y;}
/*# sourceURL=ace/css/ace-tm */</style><style id="ace_editor.css">.ace_br1 {border-top-left-radius    : 3px;}.ace_br2 {border-top-right-radius   : 3px;}.ace_br3 {border-top-left-radius    : 3px; border-top-right-radius:    3px;}.ace_br4 {border-bottom-right-radius: 3px;}.ace_br5 {border-top-left-radius    : 3px; border-bottom-right-radius: 3px;}.ace_br6 {border-top-right-radius   : 3px; border-bottom-right-radius: 3px;}.ace_br7 {border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px;}.ace_br8 {border-bottom-left-radius : 3px;}.ace_br9 {border-top-left-radius    : 3px; border-bottom-left-radius:  3px;}.ace_br10{border-top-right-radius   : 3px; border-bottom-left-radius:  3px;}.ace_br11{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-left-radius:  3px;}.ace_br12{border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br13{border-top-left-radius    : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br14{border-top-right-radius   : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br15{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px; border-bottom-left-radius: 3px;}.ace_editor {position: relative;overflow: hidden;font: 12px/normal 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;direction: ltr;text-align: left;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);}.ace_scroller {position: absolute;overflow: hidden;top: 0;bottom: 0;background-color: inherit;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;cursor: text;}.ace_content {position: absolute;box-sizing: border-box;min-width: 100%;contain: style size layout;}.ace_dragging .ace_scroller:before{position: absolute;top: 0;left: 0;right: 0;bottom: 0;content: '';background: rgba(250, 250, 250, 0.01);z-index: 1000;}.ace_dragging.ace_dark .ace_scroller:before{background: rgba(0, 0, 0, 0.01);}.ace_selecting, .ace_selecting * {cursor: text !important;}.ace_gutter {position: absolute;overflow : hidden;width: auto;top: 0;bottom: 0;left: 0;cursor: default;z-index: 4;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;contain: style size layout;}.ace_gutter-active-line {position: absolute;left: 0;right: 0;}.ace_scroller.ace_scroll-left {box-shadow: 17px 0 16px -16px rgba(0, 0, 0, 0.4) inset;}.ace_gutter-cell {position: absolute;top: 0;left: 0;right: 0;padding-left: 19px;padding-right: 6px;background-repeat: no-repeat;}.ace_gutter-cell.ace_error {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAABOFBMVEX/////////QRswFAb/Ui4wFAYwFAYwFAaWGAfDRymzOSH/PxswFAb/SiUwFAYwFAbUPRvjQiDllog5HhHdRybsTi3/Tyv9Tir+Syj/UC3////XurebMBIwFAb/RSHbPx/gUzfdwL3kzMivKBAwFAbbvbnhPx66NhowFAYwFAaZJg8wFAaxKBDZurf/RB6mMxb/SCMwFAYwFAbxQB3+RB4wFAb/Qhy4Oh+4QifbNRcwFAYwFAYwFAb/QRzdNhgwFAYwFAbav7v/Uy7oaE68MBK5LxLewr/r2NXewLswFAaxJw4wFAbkPRy2PyYwFAaxKhLm1tMwFAazPiQwFAaUGAb/QBrfOx3bvrv/VC/maE4wFAbRPBq6MRO8Qynew8Dp2tjfwb0wFAbx6eju5+by6uns4uH9/f36+vr/GkHjAAAAYnRSTlMAGt+64rnWu/bo8eAA4InH3+DwoN7j4eLi4xP99Nfg4+b+/u9B/eDs1MD1mO7+4PHg2MXa347g7vDizMLN4eG+Pv7i5evs/v79yu7S3/DV7/498Yv24eH+4ufQ3Ozu/v7+y13sRqwAAADLSURBVHjaZc/XDsFgGIBhtDrshlitmk2IrbHFqL2pvXf/+78DPokj7+Fz9qpU/9UXJIlhmPaTaQ6QPaz0mm+5gwkgovcV6GZzd5JtCQwgsxoHOvJO15kleRLAnMgHFIESUEPmawB9ngmelTtipwwfASilxOLyiV5UVUyVAfbG0cCPHig+GBkzAENHS0AstVF6bacZIOzgLmxsHbt2OecNgJC83JERmePUYq8ARGkJx6XtFsdddBQgZE2nPR6CICZhawjA4Fb/chv+399kfR+MMMDGOQAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: 2px center;}.ace_gutter-cell.ace_warning {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAmVBMVEX///8AAAD///8AAAAAAABPSzb/5sAAAAB/blH/73z/ulkAAAAAAAD85pkAAAAAAAACAgP/vGz/rkDerGbGrV7/pkQICAf////e0IsAAAD/oED/qTvhrnUAAAD/yHD/njcAAADuv2r/nz//oTj/p064oGf/zHAAAAA9Nir/tFIAAAD/tlTiuWf/tkIAAACynXEAAAAAAAAtIRW7zBpBAAAAM3RSTlMAABR1m7RXO8Ln31Z36zT+neXe5OzooRDfn+TZ4p3h2hTf4t3k3ucyrN1K5+Xaks52Sfs9CXgrAAAAjklEQVR42o3PbQ+CIBQFYEwboPhSYgoYunIqqLn6/z8uYdH8Vmdnu9vz4WwXgN/xTPRD2+sgOcZjsge/whXZgUaYYvT8QnuJaUrjrHUQreGczuEafQCO/SJTufTbroWsPgsllVhq3wJEk2jUSzX3CUEDJC84707djRc5MTAQxoLgupWRwW6UB5fS++NV8AbOZgnsC7BpEAAAAABJRU5ErkJggg==");background-position: 2px center;}.ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAAAAAA6mKC9AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAAJ0Uk5TAAB2k804AAAAPklEQVQY02NgIB68QuO3tiLznjAwpKTgNyDbMegwisCHZUETUZV0ZqOquBpXj2rtnpSJT1AEnnRmL2OgGgAAIKkRQap2htgAAAAASUVORK5CYII=");background-position: 2px center;}.ace_dark .ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAJFBMVEUAAAChoaGAgIAqKiq+vr6tra1ZWVmUlJSbm5s8PDxubm56enrdgzg3AAAAAXRSTlMAQObYZgAAAClJREFUeNpjYMAPdsMYHegyJZFQBlsUlMFVCWUYKkAZMxZAGdxlDMQBAG+TBP4B6RyJAAAAAElFTkSuQmCC");}.ace_scrollbar {contain: strict;position: absolute;right: 0;bottom: 0;z-index: 6;}.ace_scrollbar-inner {position: absolute;cursor: text;left: 0;top: 0;}.ace_scrollbar-v{overflow-x: hidden;overflow-y: scroll;top: 0;}.ace_scrollbar-h {overflow-x: scroll;overflow-y: hidden;left: 0;}.ace_print-margin {position: absolute;height: 100%;}.ace_text-input {position: absolute;z-index: 0;width: 0.5em;height: 1em;opacity: 0;background: transparent;-moz-appearance: none;appearance: none;border: none;resize: none;outline: none;overflow: hidden;font: inherit;padding: 0 1px;margin: 0 -1px;contain: strict;-ms-user-select: text;-moz-user-select: text;-webkit-user-select: text;user-select: text;white-space: pre!important;}.ace_text-input.ace_composition {background: transparent;color: inherit;z-index: 1000;opacity: 1;}.ace_composition_placeholder { color: transparent }.ace_composition_marker { border-bottom: 1px solid;position: absolute;border-radius: 0;margin-top: 1px;}[ace_nocontext=true] {transform: none!important;filter: none!important;perspective: none!important;clip-path: none!important;mask : none!important;contain: none!important;perspective: none!important;mix-blend-mode: initial!important;z-index: auto;}.ace_layer {z-index: 1;position: absolute;overflow: hidden;word-wrap: normal;white-space: pre;height: 100%;width: 100%;box-sizing: border-box;pointer-events: none;}.ace_gutter-layer {position: relative;width: auto;text-align: right;pointer-events: auto;height: 1000000px;contain: style size layout;}.ace_text-layer {font: inherit !important;position: absolute;height: 1000000px;width: 1000000px;contain: style size layout;}.ace_text-layer > .ace_line, .ace_text-layer > .ace_line_group {contain: style size layout;position: absolute;top: 0;left: 0;right: 0;}.ace_hidpi .ace_text-layer,.ace_hidpi .ace_gutter-layer,.ace_hidpi .ace_content,.ace_hidpi .ace_gutter {contain: strict;will-change: transform;}.ace_hidpi .ace_text-layer > .ace_line, .ace_hidpi .ace_text-layer > .ace_line_group {contain: strict;}.ace_cjk {display: inline-block;text-align: center;}.ace_cursor-layer {z-index: 4;}.ace_cursor {z-index: 4;position: absolute;box-sizing: border-box;border-left: 2px solid;transform: translatez(0);}.ace_multiselect .ace_cursor {border-left-width: 1px;}.ace_slim-cursors .ace_cursor {border-left-width: 1px;}.ace_overwrite-cursors .ace_cursor {border-left-width: 0;border-bottom: 1px solid;}.ace_hidden-cursors .ace_cursor {opacity: 0.2;}.ace_smooth-blinking .ace_cursor {transition: opacity 0.18s;}.ace_animate-blinking .ace_cursor {animation-duration: 1000ms;animation-timing-function: step-end;animation-name: blink-ace-animate;animation-iteration-count: infinite;}.ace_animate-blinking.ace_smooth-blinking .ace_cursor {animation-duration: 1000ms;animation-timing-function: ease-in-out;animation-name: blink-ace-animate-smooth;}@keyframes blink-ace-animate {from, to { opacity: 1; }60% { opacity: 0; }}@keyframes blink-ace-animate-smooth {from, to { opacity: 1; }45% { opacity: 1; }60% { opacity: 0; }85% { opacity: 0; }}.ace_marker-layer .ace_step, .ace_marker-layer .ace_stack {position: absolute;z-index: 3;}.ace_marker-layer .ace_selection {position: absolute;z-index: 5;}.ace_marker-layer .ace_bracket {position: absolute;z-index: 6;}.ace_marker-layer .ace_active-line {position: absolute;z-index: 2;}.ace_marker-layer .ace_selected-word {position: absolute;z-index: 4;box-sizing: border-box;}.ace_line .ace_fold {box-sizing: border-box;display: inline-block;height: 11px;margin-top: -2px;vertical-align: middle;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACJJREFUeNpi+P//fxgTAwPDBxDxD078RSX+YeEyDFMCIMAAI3INmXiwf2YAAAAASUVORK5CYII=");background-repeat: no-repeat, repeat-x;background-position: center center, top left;color: transparent;border: 1px solid black;border-radius: 2px;cursor: pointer;pointer-events: auto;}.ace_dark .ace_fold {}.ace_fold:hover{background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACBJREFUeNpi+P//fz4TAwPDZxDxD5X4i5fLMEwJgAADAEPVDbjNw87ZAAAAAElFTkSuQmCC");}.ace_tooltip {background-color: #FFF;background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.1));border: 1px solid gray;border-radius: 1px;box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);color: black;max-width: 100%;padding: 3px 4px;position: fixed;z-index: 999999;box-sizing: border-box;cursor: default;white-space: pre;word-wrap: break-word;line-height: normal;font-style: normal;font-weight: normal;letter-spacing: normal;pointer-events: none;}.ace_folding-enabled > .ace_gutter-cell {padding-right: 13px;}.ace_fold-widget {box-sizing: border-box;margin: 0 -12px 0 1px;display: none;width: 11px;vertical-align: top;background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42mWKsQ0AMAzC8ixLlrzQjzmBiEjp0A6WwBCSPgKAXoLkqSot7nN3yMwR7pZ32NzpKkVoDBUxKAAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: center;border-radius: 3px;border: 1px solid transparent;cursor: pointer;}.ace_folding-enabled .ace_fold-widget {display: inline-block;   }.ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42m3HwQkAMAhD0YzsRchFKI7sAikeWkrxwScEB0nh5e7KTPWimZki4tYfVbX+MNl4pyZXejUO1QAAAABJRU5ErkJggg==");}.ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAGCAYAAAAG5SQMAAAAOUlEQVR42jXKwQkAMAgDwKwqKD4EwQ26sSOkVWjgIIHAzPiCgaqiqnJHZnKICBERHN194O5b9vbLuAVRL+l0YWnZAAAAAElFTkSuQmCCXA==");}.ace_fold-widget:hover {border: 1px solid rgba(0, 0, 0, 0.3);background-color: rgba(255, 255, 255, 0.2);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.7);}.ace_fold-widget:active {border: 1px solid rgba(0, 0, 0, 0.4);background-color: rgba(0, 0, 0, 0.05);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.8);}.ace_dark .ace_fold-widget {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHklEQVQIW2P4//8/AzoGEQ7oGCaLLAhWiSwB146BAQCSTPYocqT0AAAAAElFTkSuQmCC");}.ace_dark .ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAH0lEQVQIW2P4//8/AxQ7wNjIAjDMgC4AxjCVKBirIAAF0kz2rlhxpAAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAFCAYAAACAcVaiAAAAHElEQVQIW2P4//+/AxAzgDADlOOAznHAKgPWAwARji8UIDTfQQAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget:hover {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);background-color: rgba(255, 255, 255, 0.1);}.ace_dark .ace_fold-widget:active {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);}.ace_inline_button {border: 1px solid lightgray;display: inline-block;margin: -1px 8px;padding: 0 5px;pointer-events: auto;cursor: pointer;}.ace_inline_button:hover {border-color: gray;background: rgba(200,200,200,0.2);display: inline-block;pointer-events: auto;}.ace_fold-widget.ace_invalid {background-color: #FFB4B4;border-color: #DE5555;}.ace_fade-fold-widgets .ace_fold-widget {transition: opacity 0.4s ease 0.05s;opacity: 0;}.ace_fade-fold-widgets:hover .ace_fold-widget {transition: opacity 0.05s ease 0.05s;opacity:1;}.ace_underline {text-decoration: underline;}.ace_bold {font-weight: bold;}.ace_nobold .ace_bold {font-weight: normal;}.ace_italic {font-style: italic;}.ace_error-marker {background-color: rgba(255, 0, 0,0.2);position: absolute;z-index: 9;}.ace_highlight-marker {background-color: rgba(255, 255, 0,0.2);position: absolute;z-index: 8;}.ace_text-input-ios {position: absolute !important;top: -100000px !important;left: -100000px !important;}
/*# sourceURL=ace/css/ace_editor.css */</style>
	
	<meta name="keywords" content="programming, code online, snippet, snippets, code debugging, run code, execute code, C, C++, Java">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	  
	<title>IDE | GeeksforGeeks | A computer science portal for geeks</title>

	<link rel="icon" href="https://ide.geeksforgeeks.org/images/gfglogo.ico" type="image/x-icon">
	<link href="./nextPermutation_files/icon" rel="stylesheet"> 
        <link href="./nextPermutation_files/css" rel="stylesheet"> 
	<link href="./nextPermutation_files/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="./nextPermutation_files/bootstrap.min.css">
	<link rel="stylesheet" href="./nextPermutation_files/style-2.2.css">
	<link rel="stylesheet" type="text/css" href="./nextPermutation_files/cookieconsent.min.css">
	<link rel="stylesheet" href="./nextPermutation_files/header-footer.css">

	<script type="text/javascript" async="" src="./nextPermutation_files/analytics.js.download"></script><script async="" src="./nextPermutation_files/analytics.js.download"></script><script src="./nextPermutation_files/jquery.min.js.download"></script>
	<script defer="" src="./nextPermutation_files/bootstrap.min.js.download"></script>
	<script src="./nextPermutation_files/clipboard.min.js.download"></script>
	<script type="text/javascript">
		var editor = null;
		(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
		(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
		m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
		ga('create', 'UA-37433965-2', 'auto');ga('send', 'pageview');
	</script>
	<script defer="" src="./nextPermutation_files/ace.js.download" onload="editor = ace.edit(&#39;editor&#39;)"></script>
	<script defer="" src="./nextPermutation_files/ext-themelist.js.download"></script>
	<script defer="" src="./nextPermutation_files/ext-language_tools.js.download"></script>
	<script defer="" src="./nextPermutation_files/gfg-4.4.js.download"></script>
	<script async="" src="./nextPermutation_files/header-footer.js.download"></script>
	<!--[if lt IE 9]>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.min.js" type="text/javascript"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js" type="text/javascript"></script>
	<![endif]-->
	<script async="async" src="./nextPermutation_files/gpt.js.download"></script>
	<script>
		var googletag = googletag || {};
		googletag.cmd = googletag.cmd || [];
	</script>
	<script type="text/javascript">
		var gptAdSlots = [];
		googletag.cmd.push(function() {
			var horizontalWLT1201HLT181Sizes = googletag.sizeMapping().addSize([1600, 768], [[88,31], [120,20], [120,30], [120,60], [120,90], [125,125], [168,28], [168,42], [180,150], [216,36], [216,54], [220,90], [234,60], [240,133], [292,30], [300,31], [300,50], [300,75], [300,100], [320,50], [320,100], [468,60], [728,90], [750,100], [930,180], [950,90], [960,90], [970,66], [970,90], [980,90], [980,120]])
				.addSize([1025, 300], [[88,31], [120,20], [120,30], [120,60], [120,90], [125,125], [168,28], [168,42], [180,150], [216,36], [216,54], [220,90], [234,60], [240,133], [292,30], [300,31], [300,50], [300,75], [300,100], [320,50], [320,100], [468,60], [728,90], [750,100]])
				.addSize([0, 0],[[88,31], [120,20], [120,30], [120,60], [120,90], [125,125], [168,28], [168,42], [180,150], [216,36], [216,54], [220,90], [234,60], [240,133]]).build();

			var verticalLT337Sizes = googletag.sizeMapping()
				.addSize([1200, 768], [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]])
				.addSize([728, 300], [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250]])
				.addSize([0, 0], [160,600]).build();

			gptAdSlots[0] = googletag.defineSlot('/27823234/IDE/Horizontal_W<1201_H<181', [[88,31], [120,20], [120,30], [120,60], [120,90], [125,125], [168,28], [168,42], [180,150], [216,36], [216,54], [220,90], [234,60], [240,133], [292,30], [300,31], [300,50], [300,75], [300,100], [320,50], [320,100], [468,60], [728,90], [750,100], [930,180], [950,90], [960,90], [970,66], [970,90], [980,90], [980,120]], 'div-gpt-ad-1525180449717-0').defineSizeMapping(horizontalWLT1201HLT181Sizes).addService(googletag.pubads());
			gptAdSlots[1] = googletag.defineSlot('/27823234/IDE/Vertical_W<337', [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]], 'div-gpt-ad-1525243586160-0').defineSizeMapping(verticalLT337Sizes).addService(googletag.pubads());
			gptAdSlots[2] = googletag.defineSlot('/27823234/IDE/Vertical_W<337', [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]], 'div-gpt-ad-1525243586160-1').defineSizeMapping(verticalLT337Sizes).addService(googletag.pubads());
			gptAdSlots[3] = googletag.defineSlot('/27823234/IDE/Horizontal_W<1201_H<181', [[88,31], [120,20], [120,30], [120,60], [120,90], [125,125], [168,28], [168,42], [180,150], [216,36], [216,54], [220,90], [234,60], [240,133], [292,30], [300,31], [300,50], [300,75], [300,100], [320,50], [320,100], [468,60], [728,90], [750,100], [930,180], [950,90], [960,90], [970,66], [970,90], [980,90], [980,120]], 'div-gpt-ad-1525180449717-1').defineSizeMapping(horizontalWLT1201HLT181Sizes).addService(googletag.pubads());
			/*
			gptAdSlots[0] = googletag.defineSlot('/27823234/IDE/Vertical_W<337', [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]], 'div-gpt-ad-1525243586160-0').defineSizeMapping(verticalLT337Sizes).addService(googletag.pubads());
			gptAdSlots[1] = googletag.defineSlot('/27823234/IDE/Vertical_W<337', [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]], 'div-gpt-ad-1525243586160-1').defineSizeMapping(verticalLT337Sizes).addService(googletag.pubads());
			gptAdSlots[2] = googletag.defineSlot('/27823234/IDE/Horizontal_W<1201_H<181', [[88,31], [120,20], [120,30], [120,60], [120,90], [125,125], [168,28], [168,42], [180,150], [216,36], [216,54], [220,90], [234,60], [240,133], [292,30], [300,31], [300,50], [300,75], [300,100], [320,50], [320,100], [468,60], [728,90], [750,100], [930,180], [950,90], [960,90], [970,66], [970,90], [980,90], [980,120]], 'div-gpt-ad-1525180449717-1').defineSizeMapping(horizontalWLT1201HLT181Sizes).addService(googletag.pubads());
			*/
			googletag.pubads().enableSingleRequest();
			googletag.pubads().collapseEmptyDivs();
			googletag.enableServices();
		});
	</script>
        <script src="./nextPermutation_files/cookieconsent.min.js.download"></script>
        <script>
        window.addEventListener("load", function(){
        window.cookieconsent.initialise({
        "palette": {
            "popup": {
              "background": "#3c404d",
              "text": "#d6d6d6"
            },
            "button": {
              "background": "#8bed4f"
            }
          },
          "theme": "classic",
            onStatusChange: function(status) {
            
            },
            law: {
              regionalLaw: false,
            },
            location: true,
            "content": {
            "message": "We use cookies to ensure you have the best browsing experience on our website. By using our site, you acknowledge that you have read and understood our <a href=\"https://www.geeksforgeeks.org/cookie-policy/\" class=\"cc-link\" target=\"_blank\">Cookie Policy</a> & ",
            "link": "Privacy Policy",
            "href": "https://www.geeksforgeeks.org/privacy-policy/"
            },
        cookie: {
        name : "geeksforgeeks_consent_status",
        }
        })});
    
        </script>
	  
<meta http-equiv="origin-trial" content="A88otRz1Fd3Nt567e2IYshC18LL3KGVXpVJW9oTCId4RYaygt23pbb4JqrbdIO/bwZPWEmRjBIRBu/bZbDR7Pg4AAABueyJvcmlnaW4iOiJodHRwczovL2ltYXNkay5nb29nbGVhcGlzLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MzQwODMxOTksImlzVGhpcmRQYXJ0eSI6dHJ1ZX0="><meta http-equiv="origin-trial" content="A0gCLbXCcL0R1Oc8tFPDs0G4Elz17w3zHp+Zst66+D17veE2o7fUcPsA114QtSTRqfVJLMeTSdeWOom0CcyCsgYAAAB7eyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MzQwODMxOTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="A9RQ+LxFazAousxUwSCzaihJjHLO1UyjQp0teZKHl7WdbVjPDfHSKMd6D/ZI5MTjqClFycbl70EFd7cBJWXqKQEAAACBeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXRhZ3NlcnZpY2VzLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MzQwODMxOTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="A6WKeWsdn1Ct+ZPqS9NCxxaiBoQ7wdTkK2/gE69Yu0gfBKJfo1gOvgkGmf5/xaIajT/RUb9AbnF1FsSZ47cCcQcAAACBeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXN5bmRpY2F0aW9uLmNvbTo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MzQwODMxOTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="A04ZCu7yjrHgwQJK5ISHhH1DSg0qqowEay3n70KO6wV3D2Mj+OX3Kw20aSMitzgdG1xfrN7sOJV/dZIk+RvCzA4AAAB2eyJvcmlnaW4iOiJodHRwczovL2dvb2dsZS5jb206NDQzIiwiZmVhdHVyZSI6IlRydXN0VG9rZW5zIiwiZXhwaXJ5IjoxNjM0MDgzMTk5LCJpc1N1YmRvbWFpbiI6dHJ1ZSwiaXNUaGlyZFBhcnR5Ijp0cnVlfQ=="><meta http-equiv="origin-trial" content="A3HucHUo1oW9s+9kIKz8mLkbcmdaj5lxt3eiIMp1Nh49dkkBlg1Fhg4Fd/r0vL69mRRA36YutI9P/lJUfL8csQoAAACFeyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiQ29udmVyc2lvbk1lYXN1cmVtZW50IiwiZXhwaXJ5IjoxNjI2MjIwNzk5LCJpc1N1YmRvbWFpbiI6dHJ1ZSwiaXNUaGlyZFBhcnR5Ijp0cnVlfQ=="><meta http-equiv="origin-trial" content="A0OysezhLoCRYomumeYlubLurZTCmsjTb087OvtCy95jNM65cfEsbajrJnhaGwiTxhz38ZZbm+UhUwQuXfVPTg0AAACLeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXN5bmRpY2F0aW9uLmNvbTo0NDMiLCJmZWF0dXJlIjoiQ29udmVyc2lvbk1lYXN1cmVtZW50IiwiZXhwaXJ5IjoxNjI2MjIwNzk5LCJpc1N1YmRvbWFpbiI6dHJ1ZSwiaXNUaGlyZFBhcnR5Ijp0cnVlfQ=="><meta http-equiv="origin-trial" content="AxoOxdZQmIoA1WeAPDixRAeWDdgs7ZtVFfH2y19ziTgD1iaHE5ZGz2UdSjubkWvob9C5PrjUfkWi4ZSLgWk3Xg8AAACLeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXRhZ3NlcnZpY2VzLmNvbTo0NDMiLCJmZWF0dXJlIjoiQ29udmVyc2lvbk1lYXN1cmVtZW50IiwiZXhwaXJ5IjoxNjI2MjIwNzk5LCJpc1N1YmRvbWFpbiI6dHJ1ZSwiaXNUaGlyZFBhcnR5Ijp0cnVlfQ=="><meta http-equiv="origin-trial" content="AwfG8hAcHnPa/kJ1Co0EvG/K0F9l1s2JZGiDLt2mhC3QI5Fh4qmsmSwrWObZFbRC9ieDaSLU6lHRxhGUF/i9sgoAAACBeyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiSW50ZXJlc3RDb2hvcnRBUEkiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="AwQ7dCmHkvR6FuOFxAuNnktYSQrGbL4dF+eBkrwNLALc69Wr//PnO1yzns3pjUoCaYbKHtVcnng2hU+8OUm0PAYAAACHeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXN5bmRpY2F0aW9uLmNvbTo0NDMiLCJmZWF0dXJlIjoiSW50ZXJlc3RDb2hvcnRBUEkiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><meta http-equiv="origin-trial" content="AysVDPGQTLD/Scn78x4mLwB1tMfje5jwUpAAzGRpWsr1NzoN7MTFhT3ClmImi2svDZA7V6nWGIV8YTPsSRTe0wYAAACHeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZXRhZ3NlcnZpY2VzLmNvbTo0NDMiLCJmZWF0dXJlIjoiSW50ZXJlc3RDb2hvcnRBUEkiLCJleHBpcnkiOjE2MjYyMjA3OTksImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><script src="./nextPermutation_files/pubads_impl_2021071901.js.download" async=""></script><script src="./nextPermutation_files/text.js.download"></script><script src="./nextPermutation_files/theme-vibrant_ink.js.download"></script><script src="./nextPermutation_files/mode-java.js.download"></script><link rel="preload" href="./nextPermutation_files/f.txt" as="script"><script type="text/javascript" src="./nextPermutation_files/f.txt"></script><link rel="preload" href="./nextPermutation_files/f(1).txt" as="script"><script type="text/javascript" src="./nextPermutation_files/f(1).txt"></script><script src="./nextPermutation_files/java.js.download"></script><style></style></head>
  
<body style="margin: 0;" class="header-body"><div role="dialog" aria-live="polite" aria-label="cookieconsent" aria-describedby="cookieconsent:desc" class="cc-window cc-banner cc-type-info cc-theme-classic cc-bottom cc-color-override-382972913 cc-invisible" style="display: none;"><!--googleoff: all--><span id="cookieconsent:desc" class="cc-message">We use cookies to ensure you have the best browsing experience on our website. By using our site, you acknowledge that you have read and understood our <a href="https://www.geeksforgeeks.org/cookie-policy/" class="cc-link" target="_blank">Cookie Policy</a> &amp;  <a aria-label="learn more about cookies" role="button" tabindex="0" class="cc-link" href="https://www.geeksforgeeks.org/privacy-policy/" target="_blank">Privacy Policy</a></span><div class="cc-compliance"><a aria-label="dismiss cookie message" role="button" tabindex="0" class="cc-btn cc-dismiss">Got it!</a></div><!--googleon: all--></div>
    <i id="utoken" style="display:none"></i>
    <div class="header-main__wrapper stick-me">
        <a href="https://ide.geeksforgeeks.org/index.php" class="header-main__logo">
            <div class="_logo">
                <svg xmlns="http://www.w3.org/2000/svg" width="76.533" height="39.026" viewBox="0 0 76.533 39.026">
                    <path d="M2380.7,6597.866a12.252,12.252,0,0,0-.261-1.513l-30.726-.027a12.545,12.545,0,0,1,.908-3.443,12.337,12.337,0,0,1,2.739-4.044,12.151,12.151,0,0,1,4.018-2.581,12.634,12.634,0,0,1,14.3,3.051l4.852-4.748a18.176,18.176,0,0,0-6.131-4.331,20.037,20.037,0,0,0-8.112-1.564,20.25,20.25,0,0,0-7.671,1.459,19.158,19.158,0,0,0-6.261,4.07,19.584,19.584,0,0,0-4.226,6.184,18.7,18.7,0,0,0-1.487,5.947h-.2a18.674,18.674,0,0,0-1.489-5.947,19.544,19.544,0,0,0-4.226-6.184,19.133,19.133,0,0,0-6.261-4.07,21.354,21.354,0,0,0-15.783.1,18.2,18.2,0,0,0-6.131,4.331l4.853,4.748a13.264,13.264,0,0,1,14.3-3.051,12.131,12.131,0,0,1,4.017,2.581,12.323,12.323,0,0,1,2.74,4.044,12.527,12.527,0,0,1,.908,3.443l-30.726.027a12.256,12.256,0,0,0-.261,1.513,15,15,0,0,0-.1,1.773,20.713,20.713,0,0,0,1.1,6.783,15.709,15.709,0,0,0,3.443,5.686,17.309,17.309,0,0,0,6,4.123,20.587,20.587,0,0,0,7.983,1.46,20.226,20.226,0,0,0,7.669-1.46,19.086,19.086,0,0,0,6.261-4.07,19.506,19.506,0,0,0,4.226-6.184,18.163,18.163,0,0,0,1.153-3.629h.871a18.27,18.27,0,0,0,1.151,3.629,19.545,19.545,0,0,0,4.226,6.184,19.111,19.111,0,0,0,6.261,4.07,20.241,20.241,0,0,0,7.671,1.46,20.572,20.572,0,0,0,7.981-1.46,17.282,17.282,0,0,0,6-4.123,15.717,15.717,0,0,0,3.445-5.686,20.726,20.726,0,0,0,1.1-6.783A15.259,15.259,0,0,0,2380.7,6597.866Zm-46.245,5.608a12.1,12.1,0,0,1-2.766,4.043,12.467,12.467,0,0,1-4.043,2.583,14.378,14.378,0,0,1-9.939.052,11.776,11.776,0,0,1-3.522-2.218,8.459,8.459,0,0,1-1.8-2.374,13.476,13.476,0,0,1-1.173-3.208l23.658,0A11.487,11.487,0,0,1,2334.457,6603.475Zm38.236,2.086a8.466,8.466,0,0,1-1.8,2.374,11.771,11.771,0,0,1-3.522,2.218,14.378,14.378,0,0,1-9.939-.052,12.491,12.491,0,0,1-4.044-2.583,12.088,12.088,0,0,1-2.765-4.043,11.427,11.427,0,0,1-.415-1.126h11.92v0h11.739A13.509,13.509,0,0,1,2372.692,6605.561Z" transform="translate(-2304.273 -6578.666)" fill="#2f8d46"></path>
                </svg>
		<svg xmlns="http://www.w3.org/2000/svg" width="45.42" height="24.603" viewBox="0 0 39.42 18.603"><defs><style>.a{fill:#0f2b3c;}</style></defs><path class="a" d="M6.021,0V-18.6H2.268V0Zm4.536-18.6V0h7.29a8.278,8.278,0,0,0,5.81-2.211A9.455,9.455,0,0,0,26.3-9.261c0-5.292-3.1-9.342-8.451-9.342ZM14.31-3.321V-15.282h3.537c3.1,0,4.7,2.835,4.7,6.021s-1.593,5.94-4.7,5.94ZM33.534-7.479h6.939v-3.375H33.534v-4.428h7.911V-18.6H29.781V0H41.688V-3.321H33.534Z" transform="translate(-2.268 18.603)"></path></svg>
            </div>
        </a>
        <div class="header-main__container">
            <span class="hamburger-menu"> <!-- sidebar on tab and mobile view -->
                <span class="gfg-burger-1"></span>
                <span class="gfg-burger-2"></span>
                <span class="gfg-burger-3"></span>
            </span>
            <ul class="header-main__list">
		<li class="dropdown header-main__list-item" data-expandable="true">
                    <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span>Theme</span></a>
                    <i class="material-icons header-main__list-item-caret">keyboard_arrow_down</i>
                    <ul class="mega-dropdown dropdown-menu">
                        <li class="theme"><a href="javascript:void(0)">Light</a></li>
                        <li class="theme"><a href="javascript:void(0)">Dark</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="header-main__left-list" data-type="0" data-nl="false">
                                <li class="header-main__left-list-item" style="margin-top: auto;margin-bottom: auto;" aria-expanded="false" data-expandable="true">
                    <div class="header-main__profile">
                        <img class="" src="./nextPermutation_files/user_web-1598433228.svg">
                    </div>
                    <ul class="mega-dropdown">
                        <li>
                            <a href="https://auth.geeksforgeeks.org/user/" class="remove-anchor__decoration">
                                <span class="material-icons">person</span>
                                <span>My Profile</span>
                            </a>
                        </li>
			<li>
                            <a class="remove-anchor__decoration" href="https://auth.geeksforgeeks.org/edit-profile.php">
                                <span class="material-icons">edit</span>
                                <span>Edit Profile</span>
                            </a>
                        </li>

                        <li>
                            <a class="remove-anchor__decoration" href="https://auth.geeksforgeeks.org/logout.php">
                                <span class="material-icons">exit_to_app</span>
                                <span>Logout</span>
                            </a>
                        </li>
                    </ul>
                </li>
                            </ul>
        </div>
        <div class="gfg-overlay display-none" id="gfg-overlay"></div>
        <div class="header-sidebar__wrapper">
            <ul class="header-sidebar__list">
                                <li class="header-sidebar__list-item" style="text-align:center;">
                    <img style="margin-bottom:10px; border-radius:50%; height:80px; width:80px;" class="" src="./nextPermutation_files/user_web-1598433228.svg">
                    <div style="display: flex; justify-content: start; margin-bottom: 20px;">
                        <a style="margin-left: 40px; display:flex; justify-content: start;" href="https://auth.geeksforgeeks.org/user/" target="_self">
                            <span style="position: relative;" class="material-icons">person</span>
                            <span>My Profile</span>
                        </a>
                        <a style="margin-left: 40px; display:flex; justify-content: start;" href="https://auth.geeksforgeeks.org/logout.php" target="_self">
                            <span style="position: relative;" class="material-icons">exit_to_app</span>
                            <span>Logout</span>
                        </a>
                    </div>
                </li>
                                <li class="header-sidebar__list-item">
                    <a href="https://ide.geeksforgeeks.org/report.php">Report Bug</a>
                </li>
                <li class="dropdown header-sidebar__list-item">
                    <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Theme <span class="caret"></span></a>
                    <ul class="dropdown-menu theme-sidebar">
                        <li class="theme"><a href="javascript:void(0)">Light</a></li>
                        <li class="theme"><a href="javascript:void(0)">Dark</a></li>
                    </ul>
                </li>
            </ul>
            <div class="" style="height: 80px;"></div>
        </div>

    </div>  <!-- header-main__wrapper stick-me -->

<script src="./nextPermutation_files/dropzone.js.download"></script>	
<script type="text/javascript">
var language = 'C';</script>
<style>
    .fullScreen {
      position: fixed;
      z-index: 1000;
      width: 100vw;
      height: 100vh;
      top: 0;
      left: 0;
      background: #fff;
      display:none;
    }

    .split {
      float: left;
      height: 100vh;
    }
</style>



<div class="fullScreen" style="z-index:1000;overflow-x:hidden;display:none">
      <div class="leftDiv split" style="overflow-y:auto;width:56%;padding:10px 20px 100px 20px;outline: 10px solid #f1f1f1;overflow-x:hidden"></div>
      <div class="rightDiv split" style="overflow-y:auto;width:44%;padding:10px 20px 100px 35px;overflow-x:hidden"></div>
  </div>

<div class="container-fluid" style="margin-bottom:15px;">
	<div class="row screen">
		<div class="col-sm-9 col-xs-12 normalScreen">
		    <div class="mainleftDiv">
			 		    	  <div class="col-sm-offset-1 col-sm-11 col-xs-12 text-center" style="margin-bottom:8px;">
				<div class="row">
					<!-- /27823234/IDE/Horizontal_W<1201_H<181 -->
<div id="div-gpt-ad-1525180449717-0" data-google-query-id="CKejyNim9_ECFaGMZgIdY48EDg">

<div id="google_ads_iframe_/27823234/IDE/Horizontal_W&lt;1201_H&lt;181_0__container__" style="border: 0pt none;"><iframe id="google_ads_iframe_/27823234/IDE/Horizontal_W&lt;1201_H&lt;181_0" title="3rd party ad content" name="google_ads_iframe_/27823234/IDE/Horizontal_W&lt;1201_H&lt;181_0" width="750" height="150" scrolling="no" marginwidth="0" marginheight="0" frameborder="0" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" style="border: 0px; vertical-align: bottom;" data-google-container-id="1" data-load-complete="true" src="./nextPermutation_files/saved_resource.html"></iframe></div></div>
				</div>
			  </div>
			  			  <div class="col-sm-1 col-xs-12">
				<div class="row form-group btn-group vertBtns" role="group">
					<button type="button" l="C" class="lang btn btn-default form-control" style="border-radius: 0;">C</button>
					<button data-toggle="tooltip" title="C++11 supported" type="button" l="Cpp" class="lang btn btn-default form-control">C++</button>
					<button type="button" l="Cpp14" class="lang btn btn-default form-control">C++14</button>
					<button type="button" l="Csharp" class="lang btn btn-default form-control">C#</button>
					<button type="button" l="Java" class="lang btn btn-default form-control" style="background-color: rgb(57, 181, 74); color: rgb(0, 0, 0);">Java</button>
					<button type="button" l="Perl" class="lang btn btn-default form-control">Perl</button>
					<button type="button" l="Php" class="lang btn btn-default form-control">PHP</button>
					<button type="button" l="Python" class="lang btn btn-default form-control">Python</button>
					<button type="button" l="Python3" class="lang btn btn-default form-control">Python 3</button>
					<button type="button" l="Scala" class="lang btn btn-default form-control" style="border-radius: 0;">Scala</button>
					<a href="https://ide.geeksforgeeks.org/tryit.php" target="_blank" class="btn btn-default form-control" style="border-radius: 0;">HTML &amp; JS</a>
				</div>
				<div class="row form-group vertBtns">
					<button id="saveFile" data-toggle="tooltip" title="Download Code" class="savebtn btn btn-default form-control">
						<span class="glyphicon glyphicon-cloud-download"></span>
					</button>
	     			<form role="form" id="uploadForm" data-toggle="tooltip" title="Upload Code" class="btn btn-default form-control dropzone dz-clickable" action="https://ide.geeksforgeeks.org/" enctype="multipart/form-data">
	       			    <span class="glyphicon glyphicon-cloud-upload"></span><input type="hidden" name="file">
	     			<div class="dz-default dz-message"><span></span></div></form>
				</div>
			</div>
			<div class="col-sm-11 col-xs-12" style="padding-left:40px">
				<div class="row">
			                <div class="btn btn-default tab col-sm-2 col-xs-4" style="border-left: 1.5px solid rgb(173, 173, 173); border-right: 1.5px solid rgb(173, 173, 173); border-top: 1.5px solid rgb(173, 173, 173); background-color: rgb(235, 235, 235); border-bottom: none;" id="tab0" name="0"> <div class="text">Java</div> <button class="btn btn-default btn-sm closeTab" name="0" style="background-color: rgb(235, 235, 235); display: none;"><i class="glyphicon glyphicon-minus-sign"></i></button>  </div><div class="btn btn-default tab col-sm-2 col-xs-4" style="display:none" id="tab1" name="1"> <div class="text">C</div> <button class="btn btn-default btn-sm closeTab" name="1" style="display: none;"><i class="glyphicon glyphicon-minus-sign"></i></button>  </div><div class="btn btn-default tab col-sm-2 col-xs-4" style="display:none" id="tab2" name="2"> <div class="text">C</div> <button class="btn btn-default btn-sm closeTab" name="2" style="display: none;"><i class="glyphicon glyphicon-minus-sign"></i></button>  </div><div class="btn btn-default tab col-sm-2 col-xs-4" style="display:none" id="tab3" name="3"> <div class="text">C</div> <button class="btn btn-default btn-sm closeTab" name="3" style="display: none;"><i class="glyphicon glyphicon-minus-sign"></i></button>  </div><div class="btn btn-default tab col-sm-2 col-xs-4" style="display:none" id="tab4" name="4"> <div class="text">Tab4</div> <button class="btn btn-default btn-sm closeTab" name="4" style="display: none;"><i class="glyphicon glyphicon-minus-sign"></i></button>  </div>	        		        <button class="btn btn-default" id="addTab"><i class="glyphicon glyphicon-plus-sign"></i></button>
			            	<a id="full" data-toggle="tooltip" title="Click to Zoom" href="javascript:void(0)">
						<span class="glyphicon glyphicon-fullscreen"></span>
					</a>
			            	<a id="splitScreen" data-toggle="tooltip" title="Click to Split" href="javascript:void(0)" style="float:right;padding:5px">
						<span class="glyphicon glyphicon-resize-full"></span>
					</a>
					<button class="btn btn-default btnEditor pull-right">Copy</button>
	        		    	<button id="reset1" class="sbt btn btn-default">
	                		<span class="glyphicon glyphicon-refresh"></span>
			                	Reset
	        		    	</button>
					<button class="btn btn-default shortkeys pull-right">Shortcuts</button>
	            		</div>
				<div class="row">
					<form role="form" class="dropzone clickable-dz dz-clickable" action="https://ide.geeksforgeeks.org/" enctype="multipart/form-data">
						<div class="form-group">
							<div class="editorBlock" style="height:500px;">
								<pre id="editor" class=" ace_editor ace-vibrant-ink ace_dark" style="font-size: 12pt;" draggable="false"><textarea class="ace_text-input" wrap="off" autocorrect="off" autocapitalize="off" spellcheck="false" style="opacity: 0; font-size: 1px; height: 1px; width: 1px; top: 496px; left: 64px;"></textarea><div class="ace_gutter" aria-hidden="true" style="left: 0px; width: 51px;"><div class="ace_layer ace_gutter-layer ace_folding-enabled" style="height: 1e+06px; top: -510px; left: 0px; width: 51px;"><div class="ace_gutter-cell " style="height: 19px; top: 494px;">27<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 513px;">28<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 532px;">29<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 551px;">30<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 570px;">31<span style="display: none; height: 19px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 589px;">32<span style="display: inline-block; height: 19px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 608px;">33<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 627px;">34<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 646px;">35<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 665px;">36<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 684px;">37<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 703px;">38<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 722px;">39<span class="ace_fold-widget ace_start ace_open" style="display: inline-block; height: 19px;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 741px;">40<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 760px;">41<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 779px;">42<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 798px;">43<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 817px;">44<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 836px;">45<span class="ace_fold-widget ace_start ace_open" style="display: inline-block; height: 19px;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 855px;">46<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 874px;">47<span class="ace_fold-widget ace_start ace_open" style="display: inline-block; height: 19px;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 893px;">48<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 912px;">49<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 931px;">50<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 950px;">51<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 19px; top: 969px;">52<span style="display: none;"></span></div><div class="ace_gutter-cell ace_gutter-active-line " style="height: 19px; top: 988px;">53<span style="display: none;"></span></div></div></div><div class="ace_scroller" style="left: 51px; right: 17px; bottom: 0px;"><div class="ace_content" style="top: -16px; left: 0px; width: 803px; height: 535px;"><div class="ace_layer ace_print-margin-layer"><div class="ace_print-margin" style="left: 724px; visibility: hidden;"></div></div><div class="ace_layer ace_marker-layer"><div class="ace_active-line" style="height: 19px; top: 494px; left: 0px; right: 0px;"></div></div><div class="ace_layer ace_text-layer" style="height: 1e+06px; margin: 0px 4px; top: -494px; left: 0px;"><div class="ace_line" style="height: 19px; top: 494px;"><span class="ace_indent-guide">    </span>   }</div><div class="ace_line" style="height: 19px; top: 513px;"><span class="ace_indent-guide">    </span>   <span class="ace_keyword">else</span></div><div class="ace_line" style="height: 19px; top: 532px;"><span class="ace_indent-guide">    </span>   <span class="ace_identifier">reverse</span>(<span class="ace_identifier">index1</span><span class="ace_constant ace_numeric">+1</span>,<span class="ace_identifier">N</span><span class="ace_constant ace_numeric">-1</span>,<span class="ace_identifier">arr</span>);</div><div class="ace_line" style="height: 19px; top: 551px;"><span class="ace_indent-guide">    </span>   <span class="ace_identifier">List</span><span class="ace_keyword ace_operator">&lt;</span><span class="ace_support ace_function">Integer</span><span class="ace_keyword ace_operator">&gt;</span> <span class="ace_identifier">a</span><span class="ace_keyword ace_operator">=</span><span class="ace_keyword">new</span> <span class="ace_identifier">ArrayList</span><span class="ace_keyword ace_operator">&lt;&gt;</span>();</div><div class="ace_line" style="height: 19px; top: 570px;"><span class="ace_indent-guide">    </span>   <span class="ace_keyword">for</span>(<span class="ace_keyword">int</span> <span class="ace_identifier">i</span>:<span class="ace_identifier">arr</span>)</div><div class="ace_line" style="height: 19px; top: 589px;"><span class="ace_indent-guide">    </span>   {</div><div class="ace_line" style="height: 19px; top: 608px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>   <span class="ace_identifier">a</span>.<span class="ace_identifier">add</span>(<span class="ace_identifier">i</span>);</div><div class="ace_line" style="height: 19px; top: 627px;"><span class="ace_indent-guide">    </span>   }</div><div class="ace_line" style="height: 19px; top: 646px;"><span class="ace_indent-guide">    </span>   <span class="ace_keyword">return</span> <span class="ace_identifier">a</span>;</div><div class="ace_line" style="height: 19px; top: 665px;"><span class="ace_indent-guide">    </span>   </div><div class="ace_line" style="height: 19px; top: 684px;">    }</div><div class="ace_line" style="height: 19px; top: 703px;">    <span class="ace_keyword">public</span> <span class="ace_keyword">static</span> <span class="ace_keyword">void</span> <span class="ace_identifier">swap</span>(<span class="ace_keyword">int</span> <span class="ace_identifier">a</span>,<span class="ace_keyword">int</span> <span class="ace_identifier">b</span>,<span class="ace_keyword">int</span> <span class="ace_identifier">arr</span>[])</div><div class="ace_line" style="height: 19px; top: 722px;">    {</div><div class="ace_line" style="height: 19px; top: 741px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">int</span> <span class="ace_identifier">temp</span><span class="ace_keyword ace_operator">=</span><span class="ace_identifier">arr</span>[<span class="ace_identifier">a</span>];</div><div class="ace_line" style="height: 19px; top: 760px;"><span class="ace_indent-guide">    </span>    <span class="ace_identifier">arr</span>[<span class="ace_identifier">a</span>]<span class="ace_keyword ace_operator">=</span><span class="ace_identifier">arr</span>[<span class="ace_identifier">b</span>];</div><div class="ace_line" style="height: 19px; top: 779px;"><span class="ace_indent-guide">    </span>    <span class="ace_identifier">arr</span>[<span class="ace_identifier">b</span>]<span class="ace_keyword ace_operator">=</span><span class="ace_identifier">temp</span>;</div><div class="ace_line" style="height: 19px; top: 798px;">    }</div><div class="ace_line" style="height: 19px; top: 817px;">    <span class="ace_keyword">public</span> <span class="ace_keyword">static</span> <span class="ace_keyword">void</span> <span class="ace_identifier">reverse</span>(<span class="ace_keyword">int</span> <span class="ace_identifier">start</span>,<span class="ace_keyword">int</span> <span class="ace_identifier">end</span>,<span class="ace_keyword">int</span> <span class="ace_identifier">arr</span>[])</div><div class="ace_line" style="height: 19px; top: 836px;">    {</div><div class="ace_line" style="height: 19px; top: 855px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">while</span>(<span class="ace_identifier">start</span><span class="ace_keyword ace_operator">&lt;</span><span class="ace_identifier">end</span>)</div><div class="ace_line" style="height: 19px; top: 874px;"><span class="ace_indent-guide">    </span>    {</div><div class="ace_line" style="height: 19px; top: 893px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">swap</span>(<span class="ace_identifier">start</span>,<span class="ace_identifier">end</span>,<span class="ace_identifier">arr</span>);</div><div class="ace_line" style="height: 19px; top: 912px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">start</span><span class="ace_keyword ace_operator">++</span>;</div><div class="ace_line" style="height: 19px; top: 931px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">end</span><span class="ace_keyword ace_operator">--</span>;</div><div class="ace_line" style="height: 19px; top: 950px;"><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 19px; top: 969px;">    }</div><div class="ace_line" style="height: 19px; top: 988px;">}</div></div><div class="ace_layer ace_marker-layer"></div><div class="ace_layer ace_cursor-layer ace_hidden-cursors"><div class="ace_cursor" style="display: block; top: 494px; left: 13px; width: 9px; height: 19px; animation-duration: 1000ms;"></div></div></div></div><div class="ace_scrollbar ace_scrollbar-v" style="width: 22px; bottom: 0px;"><div class="ace_scrollbar-inner" style="width: 22px; height: 1007px;"></div></div><div class="ace_scrollbar ace_scrollbar-h" style="display: none; height: 22px; left: 51px; right: 17px;"><div class="ace_scrollbar-inner" style="height: 22px; width: 831px;"></div></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: hidden;"><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: visible;">הההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההה</div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font-style: inherit; font-variant: inherit; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; overflow: visible;">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</div></div></pre>
							</div>
						</div>
					<div class="dz-default dz-message"><span></span></div></form>
				</div>
			   </div>
			</div>
			<div class="mainRightDiv">
				<div class="row">
					<div class="col-sm-offset-1 col-sm-11 col-xs-12" style="padding-left:38px">
						<div class="row inputRunDiv">
							<div class="form-group col-sm-7 col-xs-12 inputDiv">
								<textarea id="input" placeholder="Input Goes Here.." maxlength="10000" class="gb wf form-control input" style="height:200px;"></textarea>
								<button class="btn btn-default btnInput" type="button">Copy</button>
							</div>
							<div class="sbt-group btn-group col-sm-5 col-xs-12" role="group">
								<button id="run" class="sbt btn btn-default" title="Run Program(Ctrl+Enter)">
									<span class="glyphicon glyphicon-chevron-right"></span>
									<b>Run</b>
								</button>
		                				<button id="runurl" class="sbt btn btn-default" title="Generates URL as well for Code Sharing">
					        	            	<span class="glyphicon glyphicon-chevron-right"></span>
		        			        			<b>Run+URL (Generates URL as well)</b>
					            		</button>				
			                   		</div>
						</div>
					</div>
				</div>
				<br>
				<div class="row">
						<div class="col-sm-11 col-xs-12">
							<div class="lang-group btn-group col-sm-12" role="group">
								<button type="button" l="C" class="lang btn btn-default">C</button>
								<button data-toggle="tooltip" title="C++11 supported" type="button" l="Cpp" class="lang btn btn-default">C++</button>
								<button type="button" l="Cpp14" class="lang btn btn-default">C++14</button>
								<button type="button" l="Csharp" class="lang btn btn-default">C#</button>
								<button type="button" l="Java" class="lang btn btn-default" style="background-color: rgb(57, 181, 74); color: rgb(0, 0, 0);">Java</button>
								<button type="button" l="Perl" class="lang btn btn-default">Perl</button>
								<button type="button" l="Php" class="lang btn btn-default">PHP</button>
								<button type="button" l="Python" class="lang btn btn-default">Python</button>
								<button type="button" l="Python3" class="lang btn btn-default">Python 3</button>
								<button type="button" l="Scala" class="lang btn btn-default">Scala</button>
							</div>
						</div>
				</div>
				<div class="row">
					<div class="col-sm-11 col-xs-12">
						<div class="form-group lang-group row">
							<div class="col-xs-6">
								<button id="saveFileSmallScreen" data-toggle="tooltip" title="Download Code" class="savebtn btn btn-default form-control">
									<span class="glyphicon glyphicon-cloud-download"></span>
								</button>
							</div>
							<div class="col-xs-6">
								<form role="form" id="uploadFormSmallScreen" data-toggle="tooltip" title="Upload Code" class="dropzone btn btn-default form-control dz-clickable" action="https://ide.geeksforgeeks.org/" enctype="multipart/form-data">
					       			    <span class="glyphicon glyphicon-cloud-upload"></span><input type="hidden" name="file">
			     					<div class="dz-default dz-message"><span></span></div></form>	
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-offset-1 col-sm-11 col-xs-12">
					<div style="display:none" class="row err">
						<div class="alert alert-danger">
							Oops! Something went wrong. You are probably allocating too much memory or producing too much output.
						</div>
					</div>
											<div class="row url" style="display:none">
		        			        <h3>Generated URL:<button class="btn btn-default btnLink pull-right">Copy</button></h3>
					                    <pre class="gb wf" id="preLink"></pre>
		                     		</div>
																<div style="display:none;" class="row cmp">
							<h3>Compile Errors : </h3>
								<pre class="gb wf" style="max-height:100px;overflow-y:scroll"></pre>
						</div>
					
				
						        	                        <div style="display:none;" class="row war">
	                                        <h3>Warnings: </h3>
	                	                        <pre class="gb wf" style="max-height:100px;overflow-y:scroll"></pre>
	                        	        </div>
		                        				

					<div style="display:none" class="row stats">
						<div class="col-sm-6" style="display:inline">
							<h4 style="display:inline;">Time(sec) : </h4>
							<h4 class="time" style="display:inline;"> 0.25 </h4>
						</div>
						<div class="col-sm-6" style="display:inline">
                                                        <h4 style="display:inline;">Memory(MB) : </h4>
                                                        <h4 class="memory" style="display:inline;"> 0.25 </h4>
                                                </div>
					</div>



													<div style="display:none;" class="row rnt">
								<h3>Runtime Errors: </h3>
								<pre class="gb wf" style="max-height:100px;overflow-y:scroll"></pre>
							</div>
																		<div style="display:none;" class="row out">
							<h3>Output: <button class="btn btn-default btnOutput pull-right">Copy</button> </h3>
							<pre class="gb wf" id="preOutput"></pre>
						</div>
									</div>
				</div>
			<div class="col-sm-offset-1 col-sm-11 col-xs-12 hidden-xs text-center">
				<div class="row">
					<!-- /27823234/IDE/Horizontal_W<1201_H<181 -->
<div id="div-gpt-ad-1525180449717-1" data-google-query-id="CKqjyNim9_ECFaGMZgIdY48EDg">

<div id="google_ads_iframe_/27823234/IDE/Horizontal_W&lt;1201_H&lt;181_1__container__" style="border: 0pt none;"><iframe id="google_ads_iframe_/27823234/IDE/Horizontal_W&lt;1201_H&lt;181_1" title="3rd party ad content" name="google_ads_iframe_/27823234/IDE/Horizontal_W&lt;1201_H&lt;181_1" width="468" height="150" scrolling="no" marginwidth="0" marginheight="0" frameborder="0" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" style="border: 0px; vertical-align: bottom;" data-google-container-id="4" data-load-complete="true" src="./nextPermutation_files/saved_resource(1).html"></iframe></div></div>
				</div>
			</div>
		</div>
		<div class="col-sm-3 col-xs-12">
			<div style="margin-bottom: 10px; margin-top: 9px;">
				<a href="https://ide.geeksforgeeks.org/report.php" class="btn btn-success form-control" type="button" style="background-color:#4CB96B;font-size: 18px;border-radius: 0;">Report Bug</a>
			</div>
			<!-- /27823234/IDE/Vertical_W<337 -->
<div id="div-gpt-ad-1525243586160-0" data-google-query-id="CKijyNim9_ECFaGMZgIdY48EDg">

<div id="google_ads_iframe_/27823234/IDE/Vertical_W&lt;337_0__container__" style="border: 0pt none;"><iframe id="google_ads_iframe_/27823234/IDE/Vertical_W&lt;337_0" title="3rd party ad content" name="google_ads_iframe_/27823234/IDE/Vertical_W&lt;337_0" width="160" height="600" scrolling="no" marginwidth="0" marginheight="0" frameborder="0" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" style="border: 0px; vertical-align: bottom;" data-google-container-id="2" data-load-complete="true" src="./nextPermutation_files/saved_resource(2).html"></iframe></div></div>
			<br>
			<div class="exploreCard" style="cursor:pointer">
				<img class="img-responsive" src="./nextPermutation_files/exploreFree-min.png">
			</div><br>
			<br>
			<!-- /27823234/IDE/Vertical_W<337 -->
<div id="div-gpt-ad-1525243586160-1" data-google-query-id="CKmjyNim9_ECFaGMZgIdY48EDg">

<div id="google_ads_iframe_/27823234/IDE/Vertical_W&lt;337_1__container__" style="border: 0pt none;"><iframe id="google_ads_iframe_/27823234/IDE/Vertical_W&lt;337_1" title="3rd party ad content" name="google_ads_iframe_/27823234/IDE/Vertical_W&lt;337_1" width="250" height="600" scrolling="no" marginwidth="0" marginheight="0" frameborder="0" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" style="border: 0px; vertical-align: bottom;" data-google-container-id="3" data-load-complete="true" src="./nextPermutation_files/saved_resource(3).html"></iframe></div></div>
		</div>
	</div>
</div>
<!--Comment Modal -->
<div class="modal fade" id="shortkeysModal" role="success">
    <div class="modal-dialog ">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">×</button>
          <h4 class="modal-title">Keyboard shortcuts for editor</h4>
        </div>
        <div class="modal-body">
			<table class="shortcutTable" border="1px solid #dfe2e5">
				<thead>
					<tr><th align="left">Action</th>
					<th align="left">Windows/Linux</th>
					<th align="left">Mac</th>
				</tr></thead>
				<tbody>
					<tr>
						<td>Run Program</td>
						<td>Ctrl-Enter</td>
						<td>Command-Enter</td>
					</tr>
					<tr>
						<td>Find</td>
						<td>Ctrl-F</td>
						<td>Command-F</td>
					</tr>
					<tr>
						<td>Replace</td>
						<td>Ctrl-H</td>
						<td>Command-Option-F</td>
					</tr>
					<tr>
						<td>Remove line</td>
						<td>Ctrl-D</td>
						<td>Command-D</td>
					</tr>
					<tr>
						<td>Move lines down</td>
						<td>Alt-Down</td>
						<td>Option-Down</td>
					</tr>
					<tr>
						<td>Move lines up</td>
						<td>Alt-UP</td>
						<td>Option-Up</td>
					</tr>
				</tbody>
			</table><br>
			<div>
				For more shortcuts you can visit the following page:
				<a href="https://github.com/ajaxorg/ace/wiki/Default-Keyboard-Shortcuts" target="_blank">Ace editor shortcuts</a>
			</div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
</div>
<style>
	table.shortcutTable	td,th {
		padding: 10px !important;
	}
	.courseCard {
		background-color: #fff;
		-webkit-box-shadow: 0px 0px 25px 0 rgba(0,0,0,.18);
		-moz-box-shadow: 0px 0px 25px 0 rgba(0,0,0,.18);
		box-shadow: 0px 0px 25px 0 rgba(0,0,0,.18);
		font-family: 'Nunito', sans-serif;
		border-radius: 3px;
		margin-bottom: 15px;
		margin-top: 20px;
		border-radius: .80rem;
		padding-bottom: 21px;
	}
</style>

    <footer class="gfg-footer" id="gfg-footer">
        <div class="footer-wrapper">
            <div class="footer-wrapper_branding">
                <a href="https://www.geeksforgeeks.org/">
                    <div class="footer-wrapper_branding-logo pre-dark"></div>
                </a>
                <div class="footer-wrapper_branding-address">
                    <i class="material-icons">room</i>
                    <span>
                        5th Floor, A-118,<br>
                        Sector-136, Noida, Uttar Pradesh - 201305
                    </span>
                </div>
                <div class="footer-wrapper_branding-email">
                    <i class="material-icons">email</i>
                    <a href="mailto:feedback@geeksforgeeks.org">feedback@geeksforgeeks.org</a>
                </div>
                <div class="footer-wrapper_branding-social">
                    <a href="https://www.facebook.com/geeksforgeeks.org/" target="_blank">
                        <div class="facebook"></div>
                    </a>
                    <a href="https://www.instagram.com/geeks_for_geeks/" target="_blank">
                        <div class="instagram"></div>
                    </a>
                    <a href="https://in.linkedin.com/company/geeksforgeeks" target="_blank">
                        <div class="linkedin"></div>
                    </a>
                    <a href="https://twitter.com/geeksforgeeks" target="_blank">
                        <div class="twitter"></div>
                    </a>
                    <a href="https://www.youtube.com/geeksforgeeksvideos" target="_blank">
                        <div class="youtube"></div>
                    </a>
                </div>
            </div>
            <div class="footer-wrapper_links">
                <ul class="footer-wrapper_links-list">
                    <li>Company</li>
                    <li><a href="https://www.geeksforgeeks.org/about/">About Us</a></li>
                    <li><a href="https://www.geeksforgeeks.org/careers/">Careers</a></li>
                    <li><a href="https://www.geeksforgeeks.org/privacy-policy/">Privacy Policy</a></li>
                    <li><a href="https://www.geeksforgeeks.org/about/contact-us/">Contact Us</a></li>
                </ul>
                <ul class="footer-wrapper_links-list">
                    <li>Learn</li>
                    <li><a href="https://www.geeksforgeeks.org/fundamentals-of-algorithms/">Algorithms</a></li>
                    <li><a href="https://www.geeksforgeeks.org/data-structures/">Data Structures</a></li>
                    <li><a href="https://www.geeksforgeeks.org/category/program-output/">Languages</a></li>
                    <li><a href="https://www.geeksforgeeks.org/articles-on-computer-science-subjects-gq/">CS
                            Subjects</a></li>
                    <li><a href="https://www.youtube.com/geeksforgeeksvideos/">Video Tutorials</a></li>
                </ul>
                <ul class="footer-wrapper_links-list">
                    <li>Practice</li>
                    <li><a href="https://practice.geeksforgeeks.org/courses/">Courses</a></li>
                    <li><a href="https://practice.geeksforgeeks.org/company-tags/">Company-wise</a></li>
                    <li><a href="https://practice.geeksforgeeks.org/topic-tags/">Topic-wise</a></li>
                    <li><a href="https://practice.geeksforgeeks.org/faq.php">How to begin?</a></li>
                </ul>
                <ul class="footer-wrapper_links-list">
                    <li>Contribute</li>
                    
                    <li><a href="https://www.geeksforgeeks.org/contribute/">Write an Article</a></li>
                    <li><a href="https://www.geeksforgeeks.org/write-interview-experience/">Write Interview
                            Experience</a></li>
                    <li><a href="https://www.geeksforgeeks.org/internship/">Internships</a></li>
                    <li><a href="https://www.geeksforgeeks.org/how-to-contribute-videos-to-geeksforgeeks/">Videos</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="footer-strip">
            <div class="copyright">
                <a href="https://in.linkedin.com/company/geeksforgeeks" target="_blank">@geeksforgeeks</a>
                <span>, Some rights reserved</span>
            </div>
            <div class="social-links">

            </div>
        </div>
    </footer>
    <!-- End of footer -->

    <link rel="stylesheet" href="./nextPermutation_files/jquery-ui.min.css">
    <script async="" type="text/javascript" src="./nextPermutation_files/jquery-ui.min.js.download"></script>
    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async="" src="./nextPermutation_files/js"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
	function gtag(){dataLayer.push(arguments);}
	gtag('js', new Date());

	gtag('config', 'UA-144087254-1');
    </script><iframe src="./nextPermutation_files/container.html" style="visibility: hidden; display: none;"></iframe>





<input type="file" class="dz-hidden-input" accept=" .cpp , .c , .java , .py , .php , .cs , .scala , .perl " style="visibility: hidden; position: absolute; top: 0px; left: 0px; height: 0px; width: 0px;"><input type="file" class="dz-hidden-input" accept=" .cpp , .c , .java , .py , .php , .cs , .scala , .perl " style="visibility: hidden; position: absolute; top: 0px; left: 0px; height: 0px; width: 0px;"><input type="file" class="dz-hidden-input" accept=" .cpp , .c , .java , .py , .php , .cs , .scala , .perl " style="visibility: hidden; position: absolute; top: 0px; left: 0px; height: 0px; width: 0px;"><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><div role="log" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></div><script type="text/javascript" src="./nextPermutation_files/saved_resource"></script><div id="dz-frame" style="display:none">  <div class="indshp-products_list-main" style="right:-280px;">
    <div id="indshp-cl-button">
      <img class="hcl-b-front" src="https://ide.geeksforgeeks.org/">
    </div>
    <div class="ind-sidebar">
     <!-- <div class="ind-sidebar-wrap">
        <a href="#" class="hc-close">x</a>-->
        <div id="hc-header">
          
			
				<!--<img src="http://www.indiashopps.com/kiran/indiashopps_logo-final.png" width="180px">-->
			
            <div class="ind-toggler" id="side-toggle"><img id="sideimg" src="chrome-extension://amanlcdnojadchadmedfkljbkffioapi/sidebar-exclusive.png" width="27px"></div>
                
        </div>
        <div class="hc-sb-content">		
          <div id="dz-products" class="hc-sb-c-wrapp">
			          
          </div>		  
        </div>     
     <!-- </div>-->
    </div>
  </div>
</div><iframe src="./nextPermutation_files/aframe.html" width="0" height="0" style="display: none;"></iframe><script type="text/javascript" src="./nextPermutation_files/geoip2.js.download"></script></body></html>