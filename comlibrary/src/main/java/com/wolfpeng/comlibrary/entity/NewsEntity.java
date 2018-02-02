package com.wolfpeng.comlibrary.entity;

import java.util.List;

/**
 * author：WolfWang
 * date：2018/1/18 15:02
 * e-mail：1678173987@qq.com
 * description：result 中的数据结构
 *
 */

public class NewsEntity{


    /**
     * stat : 1
     * data : [{"uniquekey":"01b5df202b2c769e248fbdc7cfbface5","title":"互联网科技｜为什么京东物流比阿里菜鸟快？","date":"2018-01-18 14:03","category":"头条","author_name":"科技圈子","url":"http://mini.eastday.com/mobile/180118140320389.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180118/20180118140320_a47b4f2040f9c42d1303e5edd6c329d7_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180118/20180118140320_a47b4f2040f9c42d1303e5edd6c329d7_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180118/20180118140320_a47b4f2040f9c42d1303e5edd6c329d7_3_mwpm_03200403.jpg"},{"uniquekey":"6e6804e3ee5329fb2ff9626824587c64","title":"男子的羊离奇失踪，6年后突然归家，却成了一只\u201c大球\u201d！","date":"2018-01-18 13:57","category":"头条","author_name":"社会奇趣事","url":"http://mini.eastday.com/mobile/180118135713100.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180118/20180118_4caffea0f0770306eca34bd1149b36df_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180118/20180118_1e7ee65a2b60348fefeef986fdfb019f_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180118/20180118_e6a46fcb6b584a772b8bc78b9865f26d_cover_mwpm_03200403.jpg"},{"uniquekey":"c72c2383db7adf77384e86127185437a","title":"四川绵阳警犬在凛冽寒风中训练","date":"2018-01-18 13:44","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180118134459577.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180118/20180118134459_c11cb24630db3a03cea9780804866e2b_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180118/20180118134459_c11cb24630db3a03cea9780804866e2b_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180118/20180118134459_c11cb24630db3a03cea9780804866e2b_1_mwpm_03200403.jpg"},{"uniquekey":"2796901dbd6190ee3db3ba88703ac914","title":"山西省质监局发布：假冒伪劣产品行政处罚案件信息公开表2018001","date":"2018-01-18 13:13","category":"头条","author_name":"山西省质监局官网","url":"http://mini.eastday.com/mobile/180118131323324.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180118/20180118131323_eef0e3c55aa0f06e43b1065580fdebae_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180118/20180118131323_eef0e3c55aa0f06e43b1065580fdebae_2_mwpm_03200403.jpg"},{"uniquekey":"d8e3e9d1caf67fef8ba6bba847600ff3","title":"福布斯为迅雷\u201c玩客云\u201d站台还是拆台？","date":"2018-01-18 13:01","category":"头条","author_name":"科技圈子","url":"http://mini.eastday.com/mobile/180118130126194.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180118/20180118130126_e5c832413bcff18b05cc076a6cb94d38_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180118/20180118130126_e5c832413bcff18b05cc076a6cb94d38_2_mwpm_03200403.jpg"},{"uniquekey":"21d49a62db36cdbe321006fc80330919","title":"\"大清理\"开始！美国将逮捕1500名加州非法移民","date":"2018-01-18 12:37","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/180118123743473.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180118/20180118123743_b309356a34704bd41f9b2e5cf7dae9ab_1_mwpm_03200403.jpg"},{"uniquekey":"95fcf2e16acf0fff27c53cbb3998e723","title":"将13个孩子囚禁在地下室！你能想到这是亲生父母干的事吗？","date":"2018-01-18 12:37","category":"头条","author_name":"加拿大必读","url":"http://mini.eastday.com/mobile/180118123736770.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180118/20180118123736_636c0574be195bf8b23c834b0c06a2d4_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180118/20180118123736_636c0574be195bf8b23c834b0c06a2d4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180118/20180118123736_636c0574be195bf8b23c834b0c06a2d4_1_mwpm_03200403.jpg"},{"uniquekey":"dcfd0febed7cba605b7cb23cfa4516c0","title":"深圳最富的五个女人，合计超千亿身家，你识得几个？","date":"2018-01-18 12:30","category":"头条","author_name":"宁波日报","url":"http://mini.eastday.com/mobile/180118123028331.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180118/20180118123028_f2f8e252ae5a54690995495186e7d8b3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180118/20180118123028_f2f8e252ae5a54690995495186e7d8b3_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180118/20180118123028_f2f8e252ae5a54690995495186e7d8b3_4_mwpm_03200403.jpg"},{"uniquekey":"72da111d31202d8116affaa6df00a329","title":"福寿人家·孝爱夕阳 2018春节联欢晚会","date":"2018-01-18 12:29","category":"头条","author_name":"中国江苏网","url":"http://mini.eastday.com/mobile/180118122927969.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180118/20180118122927_139a21bdb6f131321d73ff0847a9ec4b_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180118/20180118122927_139a21bdb6f131321d73ff0847a9ec4b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180118/20180118122927_139a21bdb6f131321d73ff0847a9ec4b_5_mwpm_03200403.jpg"},{"uniquekey":"f4048f45a0a3fb96838c443a6e18b3ce","title":"中俄联手给日本戴上\u201c紧箍咒\u201d！中国赚3.8亿，日本亏458亿","date":"2018-01-18 12:08","category":"头条","author_name":"烽火狼烟","url":"http://mini.eastday.com/mobile/180118120836206.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180118/20180118_de1cae03f99917c34278183ca532fa03_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180118/20180118_b3f4b7387fc35d8271059f996aa7360e_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180118/20180118_6a9e979bb6d1ff4bd11b0decb4882110_cover_mwpm_03200403.jpg"},{"uniquekey":"38d9a478e474ee13724824ecc846d44d","title":"2017上海博物馆大数据出炉：红色纪念馆参观人数喷涌式增长","date":"2018-01-18 12:04","category":"头条","author_name":"新民网","url":"http://mini.eastday.com/mobile/180118120445076.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180118/20180118120445_59acd308dcdb69f2e3d303d7e4ea60e2_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180118/20180118120445_59acd308dcdb69f2e3d303d7e4ea60e2_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180118/20180118120445_59acd308dcdb69f2e3d303d7e4ea60e2_1_mwpm_03200403.jpg"},{"uniquekey":"04850bc183de0d359960ecfcf41f2f03","title":"美国将淘宝等9中企列\u201c恶名市场\u201d名单 商务部回应","date":"2018-01-18 12:04","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180118120404075.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180118/20180118120404_13e0ce488b9c793e06f42bb6de868fcb_1_mwpm_03200403.jpg"},{"uniquekey":"7ec6750deefa23d3d2d247b1628e04b5","title":"潜水团队探秘世界上最大水下洞穴，或与现世文明有关","date":"2018-01-18 12:03","category":"头条","author_name":"观天下","url":"http://mini.eastday.com/mobile/180118120345453.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180118/20180118_e82f94792a918727f977d9d0f4a91b2e_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180118/20180118_ae56f1154d997d1049a7a72bdcf7574f_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180118/20180118_dec3352b83a4108e29337aa40a1ae13a_mwpm_03200403.jpg"},{"uniquekey":"b7f07fe872182635d49be3d28ecbea23","title":"传说中的美人鱼真存在? 那不过是人类与儒艮的一场美丽误会","date":"2018-01-18 11:51","category":"头条","author_name":"未来网","url":"http://mini.eastday.com/mobile/180118115133329.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180118/20180118115133_7b69d00f67fe9b1f31909497cc6d0c89_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180118/20180118115133_7b69d00f67fe9b1f31909497cc6d0c89_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180118/20180118115133_7b69d00f67fe9b1f31909497cc6d0c89_4_mwpm_03200403.jpg"},{"uniquekey":"016876b3b099a48da6a885701152a903","title":"毛泽东为何摆手示意不穿叶剑英元帅送来的防弹服","date":"2018-01-18 11:36","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180118113624836.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180118/20180118113624_9f793f8df4e53ec6861a86451706e2ef_1_mwpm_03200403.jpg"},{"uniquekey":"ec7929ac60e422ee911147c7ffe7a98e","title":"驻大阪总领事李天然出席日本国贸促京都总局2018新年会","date":"2018-01-18 11:24","category":"头条","author_name":"驻大阪总领馆","url":"http://mini.eastday.com/mobile/180118112412346.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180118/20180118112412_c45c25c75bb8c6032859eb443bfd9811_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180118/20180118112412_c45c25c75bb8c6032859eb443bfd9811_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180118/20180118112412_c45c25c75bb8c6032859eb443bfd9811_3_mwpm_03200403.jpg"},{"uniquekey":"1d36000321bd0c2347cbf889637d08db","title":"李明博难逃青瓦台魔咒，韩国前总统为何全军覆没？","date":"2018-01-18 11:12","category":"头条","author_name":"新闻重案组","url":"http://mini.eastday.com/mobile/180118111242413.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180118/20180118_3bd55cb13b5374abb35bcce5b53b86e7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180118/20180118_4a544ea80312de59c2b96023e32ab4f3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180118/20180118_ed098d9120cd146c055b00113edf2b30_mwpm_03200403.jpg"},{"uniquekey":"44e2326179df3db4f5097e2e3addae67","title":"强强联手！数据宝与国家发改委直属机关国家信息中心的全资公司中国国信签署战略合作协议","date":"2018-01-18 10:58","category":"头条","author_name":"东北新闻网","url":"http://mini.eastday.com/mobile/180118105824892.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180118/20180118105824_2adb05269dd2be1a5f8ff6d9b4d5b8c3_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180118/20180118105824_2adb05269dd2be1a5f8ff6d9b4d5b8c3_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180118/20180118105824_2adb05269dd2be1a5f8ff6d9b4d5b8c3_3_mwpm_03200403.jpg"},{"uniquekey":"0e555a1d543bbf7c263d4e81df795918","title":"日政府将阻止韩征用劳工像，在慰安妇问题上也拒不承认","date":"2018-01-18 10:54","category":"头条","author_name":"观天下","url":"http://mini.eastday.com/mobile/180118105412242.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180118/20180118_8a4612bb1c961975a588ed9f188c8e17_mwpm_03200403.jpg"},{"uniquekey":"ba529814b69fdcc80e1639c1ad8e812b","title":"只有中文广告的一辆公交车登上加拿大社交媒体热搜，原因却有点尴尬 ...","date":"2018-01-18 10:51","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/180118105118830.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180118/20180118105118_7e34aead6ac923185b35fd2963f93cde_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180118/20180118105118_7e34aead6ac923185b35fd2963f93cde_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180118/20180118105118_7e34aead6ac923185b35fd2963f93cde_3_mwpm_03200403.jpg"},{"uniquekey":"466f6b2cf9b86107c77f61247c65b2c8","title":"中国火箭点火后22秒坠地爆炸, 上百人牺牲, 航天史上大事故","date":"2018-01-18 10:50","category":"头条","author_name":"当兵女神","url":"http://mini.eastday.com/mobile/180118105005843.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180118/20180118_03333aebcfcf6e6b93d03f833e5acd03_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20180118/20180118_b5d046f196b8382bd357e40fa7002d2a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20180118/20180118_0dbcc18c3d845618908556da2bb516d7_cover_mwpm_03200403.jpg"},{"uniquekey":"cc2f9e8911fd1b71e24fd3f9f175542b","title":"心机小偷换装设陷阱 投诉民警态度不好装无辜","date":"2018-01-18 10:37","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/180118103721984.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180118/20180118103721_a16fddda3d6b6346719a4cc3ff3a8bc8_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180118/20180118103721_a16fddda3d6b6346719a4cc3ff3a8bc8_2_mwpm_03200403.jpg"},{"uniquekey":"8124128d913e3c324301f4d5f3124152","title":"喂，派出所吗？救人的民警结婚了吗？","date":"2018-01-18 10:32","category":"头条","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/180118103220165.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180118/20180118103220_0d2cc83b56f1504d684bacc3eac48170_1_mwpm_03200403.jpg"},{"uniquekey":"778fcc4642c5d6559449f7a0f705f8e7","title":"三年未上厕所成世界上第一个被憋死的人 大肠被放在博物馆展出","date":"2018-01-18 10:29","category":"头条","author_name":"你若乘风","url":"http://mini.eastday.com/mobile/180118102934931.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180118/20180118_3c86a370194abff68058655ccfdbd7dc_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180118/20180118_fbcf065d478675ed963880353b313aaa_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180118/20180118_687972c8e5269b0838be312aca3df700_mwpm_03200403.jpg"},{"uniquekey":"d5db84a849696e3e4fdf7f162a0f4ff2","title":"美国前参议员被授予国会金质奖章 获特朗普献吻表情惊呆了","date":"2018-01-18 10:27","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/180118102730755.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180118/20180118102730_0667b199a9078aac877785a14439b210_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180118/20180118102730_0667b199a9078aac877785a14439b210_10_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180118/20180118102730_0667b199a9078aac877785a14439b210_9_mwpm_03200403.jpg"},{"uniquekey":"ef4a3227b5ec03934823da1e91ef09dd","title":"台大学生游大陆感叹两岸差距：大陆进步吓死人 台湾仍是\u201c玻璃心\u201d","date":"2018-01-18 10:19","category":"头条","author_name":"未来网","url":"http://mini.eastday.com/mobile/180118101926279.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180118/20180118101926_083b5cd4a170985be5cd2a280f7a894c_14_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180118/20180118101926_083b5cd4a170985be5cd2a280f7a894c_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180118/20180118101926_083b5cd4a170985be5cd2a280f7a894c_1_mwpm_03200403.jpg"},{"uniquekey":"1426645f7afad2c4c842f8f35cda4266","title":"华为内部处罚管理不善责任人 任正非被罚百万","date":"2018-01-18 10:17","category":"头条","author_name":"网易科技报道","url":"http://mini.eastday.com/mobile/180118101724903.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180118/20180118101724_26361e771aa07889f83ecb71b07e1582_1_mwpm_03200403.jpg"},{"uniquekey":"358825d7060d69949beda6c5d3af7bbc","title":"四大强国走到一起要整合军力 专家称对手只有一个国家","date":"2018-01-18 10:13","category":"头条","author_name":"享受生活乐趣","url":"http://mini.eastday.com/mobile/180118101321350.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180118/20180118_dde3b15da6ce222838662c2c63cd1b2e_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180118/20180118_b3c7f3522c343e851a529fe1a068620d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180118/20180118_c8c569fad755d8cbfa3859bf3b6f619e_cover_mwpm_03200403.jpg"},{"uniquekey":"431929e846dd580622f06b69f2e745dd","title":"死亡过山车上了之后三分钟内必丧命 凡是坐过的人没有活着下来的","date":"2018-01-18 10:07","category":"头条","author_name":"你若乘风","url":"http://mini.eastday.com/mobile/180118100723525.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180118/20180118_cfa9385319a23ae51af16361b0889689_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180118/20180118_5e4497b37bbfc7f164208712cb77376d_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180118/20180118_f62d4a991235aec01f933c1a835ef05f_mwpm_03200403.jpg"},{"uniquekey":"bbd72287f05312a323700719128c88b6","title":"直击！记者体验东航Wi-Fi航班：手机连网很方便 名额网速有限制","date":"2018-01-18 10:04","category":"头条","author_name":"东方网","url":"http://mini.eastday.com/mobile/180118100421173.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180118/20180118100421_b6b80ad23e58061cf5815c14bba3576f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180118/20180118100421_b6b80ad23e58061cf5815c14bba3576f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180118/20180118100421_b6b80ad23e58061cf5815c14bba3576f_6_mwpm_03200403.jpg"}]
     */

    private String stat;
    private List<DataBean> data;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * uniquekey : 01b5df202b2c769e248fbdc7cfbface5
         * title : 互联网科技｜为什么京东物流比阿里菜鸟快？
         * date : 2018-01-18 14:03
         * category : 头条
         * author_name : 科技圈子
         * url : http://mini.eastday.com/mobile/180118140320389.html
         * thumbnail_pic_s : http://01.imgmini.eastday.com/mobile/20180118/20180118140320_a47b4f2040f9c42d1303e5edd6c329d7_1_mwpm_03200403.jpg
         * thumbnail_pic_s02 : http://01.imgmini.eastday.com/mobile/20180118/20180118140320_a47b4f2040f9c42d1303e5edd6c329d7_2_mwpm_03200403.jpg
         * thumbnail_pic_s03 : http://01.imgmini.eastday.com/mobile/20180118/20180118140320_a47b4f2040f9c42d1303e5edd6c329d7_3_mwpm_03200403.jpg
         */

        private String uniquekey;
        private String title;
        private String date;
        private String category;
        private String author_name;
        private String url;
        private String thumbnail_pic_s;
        private String thumbnail_pic_s02;
        private String thumbnail_pic_s03;

        public String getUniquekey() {
            return uniquekey;
        }

        public void setUniquekey(String uniquekey) {
            this.uniquekey = uniquekey;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumbnail_pic_s() {
            return thumbnail_pic_s;
        }

        public void setThumbnail_pic_s(String thumbnail_pic_s) {
            this.thumbnail_pic_s = thumbnail_pic_s;
        }

        public String getThumbnail_pic_s02() {
            return thumbnail_pic_s02;
        }

        public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
            this.thumbnail_pic_s02 = thumbnail_pic_s02;
        }

        public String getThumbnail_pic_s03() {
            return thumbnail_pic_s03;
        }

        public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
            this.thumbnail_pic_s03 = thumbnail_pic_s03;
        }


        @Override
        public String toString() {
            return "DataBean{" +
                    "uniquekey='" + uniquekey + '\'' +
                    ", title='" + title + '\'' +
                    ", date='" + date + '\'' +
                    ", category='" + category + '\'' +
                    ", author_name='" + author_name + '\'' +
                    ", url='" + url + '\'' +
                    ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                    ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                    ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "NewsEntity{" +
                "stat='" + stat + '\'' +
                ", data=" + data +
                '}';
    }
}
