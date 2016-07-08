

## 写在前面的话

毕业快两年了，一直都想自己开发一款APP。以前在学校的时候也开发过一款APP，参加了一些比赛，虽然获得一些奖项，但还是感觉太菜，估计是在学校里面开发的吧，现在毕业快两年了，也该开发一款自己的APP来检测一下自己目前的水平如何？这款APP其实已经构思了好久了，估计得有1年了，早就想把它实现出来，但是一直都是拖呀拖的，现在已经下决心要将它实现出来，哪怕每天实现一点，总归可以完成的。
<!--more-->

## Jkindey
一款关于肾病方面知识的APP，包含一些常用的操作如登陆、注册、发帖、记录检查项目，目前打算第一个版本先进行一些简单功能的开发，后期再一步步进行优化，打算使用Google MD来设计这款APP，毕竟这款APP不是用于商业的，所以就以是简洁、实用为主，由于这是我自己独立开发的，所以周期应该比较长，没关系，做到哪里保存到哪里，相信最后一定会成品！。

### 1、由来：
毕业到现在已经差不多快2年了，期间生了一场病，“肾病”没得这种病的是不会了解的，我一开始也决不会认为自己会生这种病，毕竟我还年轻，我才24岁，怎么会生肾病的？一般都是年纪大的肾脏才会出问题的，直到我进入到这个世界才发现，肾病是不分年龄的，有刚出生就生病的，有已经70、80岁生这种病的，生病了才懂得健康的重要，可惜已经迟了。生病了，每天都要吃一堆药，每个月都要去医院检查各种项目，什么尿常规，尿定量。血常规、血生化之类的各种检查，所以就会产生一堆的检查报告单，每次看完报告单随手一扔不大好，应该进行总结一下，看看什么指标在一段时间内是正常的还是有异常，最好用折线图表示出来，因此就想开发这么一款APP，能够进行各种统计，病给出提醒，实用而且必须简洁，所以这款APP由此诞生啦！

### 2、如何设计

#### 2.1、UI
UI方面打算采用Google最新的材料MD设计，毕竟这不是商业项目是我自己想出来的，所以会要求它美观、简洁、实用。

#### 2.2、功能
功能方面，首先第一版是不会搞太复杂的，就进行一些基础的功能，主要有登录、注册、添加检查记录、查看检查记录、阅读一些新闻资讯，还有一些基础的设置功能。

#### 2.3、代码
在编写过程中，我将会记录一些开发过程中实用到的第三方库，便于查阅，同时也会开源出源代码，写的不好，请见谅哈！

### 3、记录
#### 3.1、关于后台
每一个APP基本上都会涉及到服务器方面，毕竟个人精力有限，而且我是Android开发，对于后台开发也不是太了解，一个人也同时搞不了移动和后台的开发，所以我打算借助第三方的平台编写，看来看去，我选择[Bmob官网](http://www.bmob.cn/)。

#### 3.2、关于图片保存
APP里面也会涉及到图片的上传保存之类的操作，我也选择了一个第三方的服务器，[七牛云存储官网](http://www.qiniu.com/)

#### 3.3、使用到的技术
APP里面会涉及到一些第三方的开源项目，在实现过程中我会详细记录使用了哪些开源项目。

### 4、开工
#### 4.1、logo
Jkidney的LOGO已经确定了：
![Jkidney](http://img.blog.csdn.net/20160410142401362)

#### 4.2、色系
Jkidney的色系采用蓝色，简洁明了，看起来也比较舒服，让人感觉很安心。

### 2016年7月8号更新

从四月份开始立意到现在的7月份，整整三个月左右时间，Jkidney第一版发布了，不过这期间真正写代码的时间不长，大概只有半个月左右，而且都是利用业余时间来完成的，比如晚上或者周末等，其余的时间就在构思如何设计app，如何设计后台表结构之类的，这倒是很费时间。不过好在最终完成了肾管家第一版的开发工作，下面来简单看下一下最终的实现效果，从设计到开发全是我一人搞定的，所以肯定会有很多不足的地方，希望可以提出来，让我把它做的越来越好！


### 肾管家Jkidney V1.0
#### 完成的功能主要有：
1. 登录/注册功能
1. 健康资讯阅读，查看一些关于健康的新闻以及一些常识
1. 检查化验单的备份以及分析功能，化验报告单主要包含“肝功能，肾功能，尿蛋白，血压，体重，血糖”等化验。
1. 实现了一个简单的记事本功能，可以记录一些心得体会等。
1. 实现了一个小计算器功能，计算肌酐清除率和肾小球过滤率计算，可以大概的了解一下肾病患者目前所处的基本阶段。


### 效果实现图
![查看健康资讯分类信息](http://note.youdao.com/yws/res/37/WEBRESOURCE483d7d9612cc9c57ae49c0cc4374f0bf)

（图1，查看健康资讯分类信息）


![图2，查看健康资讯列表](http://note.youdao.com/yws/res/41/WEBRESOURCE0a9000e01d79372770c78858285b0e25)

（图2，查看健康资讯列表）


![图3，查看健康资讯详情](http://note.youdao.com/yws/res/45/WEBRESOURCEe25bc71e20fb1b23991f1824ede531ff)

（图3，查看健康资讯详情）


![图4，查看化验单导入分类](http://note.youdao.com/yws/res/48/WEBRESOURCE1280f5d31699e5b24b9ed6e2479347aa)

（图4，查看化验单导入分类）


![图5，添加一项化验记录](http://note.youdao.com/yws/res/51/WEBRESOURCE67420c6798d778e9fda7c83230a7210c)

（图5，添加一项化验记录）


![图6，化验记录导入列表](http://note.youdao.com/yws/res/54/WEBRESOURCE4663039fb1321f15baf2a9c6b31a2ef5)

（图6，化验记录导入列表）


![image](http://note.youdao.com/yws/res/57/WEBRESOURCEdf13f5bdb76c0220781a00be42d854f0)

（图7，柱状图分析化验记录）


![image](http://note.youdao.com/yws/res/60/WEBRESOURCEc7c858d0717721a15b9ce38216cb34c4)

（图8，笔记本功能）


![图9，肾功能计算](http://note.youdao.com/yws/res/63/WEBRESOURCEf5eac5673997fd6401eaba4019f6f8e7)

（图9，肾功能计算）


![图10，肌酐清除率计算](http://note.youdao.com/yws/res/66/WEBRESOURCEd936e7994faad7a7ac2dda374128c717)

（图10，肌酐清除率计算）


![图11，计算结果检查](http://note.youdao.com/yws/res/68/WEBRESOURCEc67655c254dd4e4d1831e0ebe7a6adf3)

（图11，计算结果检查）


![图12，我的页面](http://note.youdao.com/yws/res/71/WEBRESOURCE742d953d080520f0287e6ee4a23515fd)

（图12，我的页面）


![图13，关于页面](http://note.youdao.com/yws/res/74/WEBRESOURCEa5a967720b9ce675cf0aa758c5ddbeb8)

（图13，关于页面）


以上便是肾管家V1.0所涉及到的功能及效果演示，下面来说说该app开发过程中所用到的技术，以及一些难点重点。


### 原理分析

在V1.0版本中主要用到了以下知识点，首先最重要的就是app中数据从哪里来以及我们如何存储数据，存储到哪里？我想这是大家所最想了解的，的确，作为一名android  App开发者，大伙很少有移动端和后台都精通的人，我也不例外，这也是我的弱点，所以我就网上查了一下，发现有隔后台一体实现的云端服务[Bmob](http://www.bmob.cn//)，通过Bmob我们就可以不用关心后端如何实现了，只需要设计一些基本的表结构即可使用了，很方便！

#### 后台数据存储 [Bmob](http://www.bmob.cn//)
支持android ios 等平台的开发，方便简单好学，省去了开发者很大的成本。

#### 资讯信息获取 [apiStore](http://apistore.baidu.com/)
在肾管家V1.0版本中实现了资讯的获取，本来一开始准本自己用爬虫来获取信息的，偶然在知乎里面看到百度有[apiStore](http://apistore.baidu.com/)的网站，里面集成了很多api 供开发者调用，简单方便，开发者只需要解析一下返回的结果就行了，简直神了。

#### 数据解析 [fastJson](https://github.com/alibaba/fastjson)

在资讯信息查看页面，需要解析后台服务器返回的数据，所以采用fastjson来解析，效率比较高，我们公司实际的项目就是用fastjson来解析的。

#### 数据刷新及分页加载
在列表页面需要用到数据刷新和分页加载的功能，我直接使用了RecyclerView来做的，但是RecyclerView不支持刷新及分页，这就需要我们自己来实现了，我们使用google提供的SwipeRefreshLayout来实现列表的刷新功能，使用
[BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper)来实现列表RecyclerView的分页加载功能。


#### 图片加载 [universal-image-loader](https://github.com/nostra13/Android-Universal-Image-Loader)

资讯列表页面的图片加载使用的是universal-image-loader

#### ViewPager及指示器 [pagerslidingtabstrip](https://github.com/astuetz/PagerSlidingTabStrip)
 
 在资讯分类的列表页面使用到了viewpager的指示器功能
 
#### app底部tab [ahbottomnavigation](https://github.com/aurelhubert/ahbottomnavigation)

在首页中，使用 ahbottomnavigation实现了“资讯，检查，我的”三个tab功能。

#### 柱状图分析 [hellocharts](https://github.com/lecho/hellocharts-android)
在检查化验单的列表页面，我们使用了hellocharts控件实现了所有检查的柱状图表示，可以明确的看出来变化规律。

基本上就是这些开源控件啦！


### apk下载地址
http://fir.im/7e4y

### 二维码下载
![image](http://note.youdao.com/yws/res/149/WEBRESOURCE638891c45588b00ab8f1908742ee50ab)


### 关于我
[我的博客](http://crazyandcoder.github.io/about/)

[我的github](https://github.com/crazyandcoder)



----------
![http://crazyandcoder.github.io/](http://img.blog.csdn.net/20160325102501040)



----------
![http://crazyandcoder.github.io/](http://img.blog.csdn.net/20160325102501040)
