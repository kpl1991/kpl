webpackJsonp([1],{0:function(e,n){},"5W1q":function(e,n){},"95yh":function(e,n){},FVZb:function(e,n,t){e.exports=t.p+"static/media/初雪.1a4a6b2.mp3"},GIIk:function(e,n){},NHnr:function(e,n,t){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var a=t("7+uW"),o={name:"Background",data:function(){return{canvasWidth:document.documentElement.clientWidth,canvasHeight:document.documentElement.clientHeight,bgmPlay:!1}},methods:{drawBgm:function(){var e=document.querySelector("#bg-canvas"),n=e.getContext("2d"),t=0,a=["rgba(0,222,255, 0.2)","rgba(157,192,249, 0.2)","rgba(0,168,255, 0.2)"];!function o(){n.clearRect(0,0,e.width,e.height);var i=n.createLinearGradient(0,e.height,e.width,0);i.addColorStop(0,"#ccc"),i.addColorStop(1,"#fff"),n.fillStyle=i,n.fillRect(0,0,e.width,e.height),t++;for(var u=a.length-1;u>=0;u--){n.fillStyle=a[u];var s=(t+45*u)*Math.PI/180,c=50*Math.sin(s),r=50*Math.cos(s);n.beginPath(),n.moveTo(0,e.height/2+c),n.bezierCurveTo(e.width/2,e.height/2+c-50,e.width/2,e.height/2+r-50,e.width,e.height/2+r),n.lineTo(e.width,e.height),n.lineTo(0,e.height),n.lineTo(0,e.height/2+c),n.closePath(),n.fill()}requestAnimationFrame(o)}()}},watch:{bgmPlay:function(){var e=document.getElementById("bgm");this.bgmPlay?e.play().then(function(){}).catch(function(n){console.log(n),e.muted=!0,e.play()}):e.pause()}},mounted:function(){var e=this,n=this;document.getElementById("bgm").addEventListener("canplay",function(){n.bgmPlay=!0}),this.drawBgm(),window.onresize=function(){e.canvasWidth=document.documentElement.clientWidth,e.canvasHeight=document.documentElement.clientHeight}}},i={render:function(){var e=this.$createElement,n=this._self._c||e;return n("div",{staticClass:"bgd"},[n("canvas",{attrs:{id:"bg-canvas",width:this.canvasWidth,height:this.canvasHeight}}),this._v(" "),this._m(0)])},staticRenderFns:[function(){var e=this.$createElement,n=this._self._c||e;return n("audio",{attrs:{id:"bgm",controls:"controls",preload:"auto",autoplay:"autoplay",loop:"loop"}},[n("source",{attrs:{src:t("madd"),type:"audio/mp3"}}),this._v(" "),n("source",{attrs:{src:"static/drip.mp3",type:"audio/mp3"}}),this._v(" "),n("source",{attrs:{src:t("FVZb"),type:"audio/mp3"}})])}]};var u={name:"App",components:{Background:t("VU/8")(o,i,!1,function(e){t("Ph/n")},"data-v-65680a9b",null).exports}},s={render:function(){var e=this.$createElement,n=this._self._c||e;return n("div",{attrs:{id:"app"}},[n("background"),this._v(" "),n("router-view")],1)},staticRenderFns:[]};var c=t("VU/8")(u,s,!1,function(e){t("gnLA")},null,null).exports,r=t("/ocq"),l={render:function(){var e=this.$createElement;return(this._self._c||e)("div",{domProps:{innerHTML:this._s(this.msg)},on:{click:this.goIn}})},staticRenderFns:[]};var m=t("VU/8")({name:"Welcome",data:function(){return{msg:"Welcom to my home"}},methods:{goIn:function(){this.$router.push({path:"/home"})}}},l,!1,function(e){t("sjCn")},"data-v-33a2c0e2",null).exports,d={name:"Container",data:function(){return{msg:"",isCollapse:!1,menus:[{menu_id:"M01",menu_nm:"导航一",menu_url:"/nav1",icon:"fa-folder-open",submenu:[{menu_id:"M0101",menu_nm:"页面一",icon:"fa-line-chart",menu_url:"/home/nav1/page1"},{menu_id:"M0102",menu_nm:"页面二",icon:"fa-bar-chart",menu_url:"/nav1/page2"}]},{menu_id:"M02",menu_nm:"导航二",menu_url:"nav2",icon:"fa-folder-open",submenu:[{menu_id:"M0201",menu_nm:"页面三",icon:"fa-folder-open",menu_url:"/nav2/page1"},{menu_id:"M0202",menu_nm:"页面四",icon:"fa-folder-open",menu_url:"/nav2/page2"}]},{menu_id:"M03",menu_nm:"导航三",menu_url:"nav3",icon:"fa-folder-open"}]}},methods:{handleOpen:function(e,n){console.log("open"),console.log(e,n)},handleClose:function(e,n){console.log(e,n)},handleSelect:function(){console.log("select",arguments)}},created:function(){var e=this;this.$http.get("http://192.168.1.112:8088/system/findMenus").then(function(n){e.msg=n.data},function(e){console.log(e)})}},h={render:function(){var e=this,n=e.$createElement,t=e._self._c||n;return t("el-container",[t("el-header",[e._v("Header")]),e._v(" "),t("el-container",[t("el-aside",{attrs:{width:"200px"}},[t("el-radio-group",{staticStyle:{"margin-bottom":"20px"},model:{value:e.isCollapse,callback:function(n){e.isCollapse=n},expression:"isCollapse"}},[t("el-radio-button",{attrs:{label:!1}},[e._v("展开")]),e._v(" "),t("el-radio-button",{attrs:{label:!0}},[e._v("收起")])],1),e._v(" "),t("el-menu",{attrs:{router:!0,"default-active":"/home/nav1/page1",collapse:e.isCollapse},on:{select:e.handleSelect,open:e.handleOpen,close:e.handleClose}},e._l(e.menus,function(n){return t("div",{key:n.menu_id},[n.submenu?e._e():t("el-menu-item",{attrs:{index:n.menu_url,route:n.menu_url}},[t("i",{staticClass:"fa fw",class:n.icon}),e._v(" "),t("span",[e._v(e._s(n.menu_nm))])]),e._v(" "),n.submenu?t("el-submenu",{attrs:{index:n.menu_url}},[t("template",{slot:"title"},[t("i",{staticClass:"fa fw",class:n.icon}),e._v(" "),t("span",[e._v(e._s(n.menu_nm))])]),e._v(" "),e._l(n.submenu,function(n){return t("el-menu-item",{key:n.menu_id,attrs:{index:n.menu_url,route:n.menu_url}},[t("i",{staticClass:"fa fw",class:n.icon}),e._v(" "),t("span",[e._v(e._s(n.menu_nm))])])})],2):e._e()],1)}))],1),e._v(" "),t("el-main",[t("router-view"),e._v(" "),t("p",[e._v(e._s(e.msg))])],1)],1)],1)},staticRenderFns:[]};var p=t("VU/8")(d,h,!1,function(e){t("GIIk")},"data-v-0e357f62",null).exports,f={render:function(){var e=this.$createElement;return(this._self._c||e)("div",[this._v("Page1")])},staticRenderFns:[]};var v=t("VU/8")({name:"Page1",data:function(){return{}},mounted:function(){}},f,!1,function(e){t("95yh")},"data-v-412b634c",null).exports;a.default.use(r.a);var _=new r.a({routes:[{path:"/",name:"welcome",component:m},{path:"/home",name:"home",component:p,children:[{path:"/home/nav1/page1",name:"nav1",component:v}]}]}),g=t("8+8L"),b=t("zL8q"),y=t.n(b);t("tvR6"),t("5W1q");a.default.config.productionTip=!1,a.default.use(g.a),a.default.use(y.a),new a.default({router:_,components:{App:c},template:"<App/>"}).$mount("#app")},"Ph/n":function(e,n){},gnLA:function(e,n){},madd:function(e,n,t){e.exports=t.p+"static/media/天籁之音.b97ceef.mp3"},sjCn:function(e,n){},tvR6:function(e,n){}},["NHnr"]);
//# sourceMappingURL=app.7b7c87214fd35178d965.js.map