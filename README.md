# GUIDE

### 2017年2月26日

1.合并管理员定位景点

2.合并邮箱绑定功能

### 2017年1月27日

1.实现邮箱绑定功能

### 2017年1月26日

1.游客绑定手机功能

2.查看所绑定的邮箱和手机

### 2017年1月25日

1.景区管理员增加，修改，删除景点管理员功能

### 2017年1月23日

1.登录成功页面

2.查询、修改个人信息

3.查询发表过的游记

4.修改密码

5.退出登录

6.邮箱手机绑定（部分前台内容）
### 2017年1月19日

1.景区管理员添加和删除景点

2.定位功能只是写进去的，还没有结合景点定位的功能，到时候和广明协调一下，再加进去

### 2017年1月17日

1.景点定位

### 2017年1月15日

1.记录游记（未设置是否公开）

### 2016年12月23日

1.完成景区管理员完善景点功能

### 2016年11月16日
1.合并超级管理员的增加管理员功能、修改功能和删除功能

（项目中有之前的java文件和html文件未删除，第二次增加管理员的摸态框未刷新）

（新增管理员时选择景区管理员’s‘，显示关于管理某一个地区景区的文本框）

（修改信息时应该是修改成景区管理员's'或审核管理员‘c'）

（在移动端时，管理员列表的最后一栏挡住按钮）

### 2016年11月13日

1.景区管理员回复建议页面和超级管理员回复建议页面加框架

### 2016年11月5日

1.修改管理员可以修改

2.审核管理员页面加框架

3.审核管理员登录后台后成功跳转

### 2016年11月4日

1.登录时写入景点管理员r的cookie

2.新增管理员时，增加邮箱填写，权限设置改为选择按钮且不可手动输入

3.实现用户完善信息功能

4.添加了.gitignore文件。（你们有空看下这个文件的作用）

5.用户投诉成功后刷新

6.审核管理员的审核信件最后一个刷新

7.回复成功后清空,回复信件内容清空

### 2016年11月3日

1.管理员Account(用户名)唯一

2.管理员动态信息表中不包含超级管理员

### 2016年11月2日

1.管理员后台 4个

2.冻结 解冻按钮（如游客已被冻结再点冻结）

3.将后台管理导航栏整理在**navTest.html**中 可直接使用

### 2016年11月1日

1.讨论时修改了回复建议页面中超级管理员用户名写“死”等

### 2016年10月19日

实现

1.将要索引的图片文件加入GUIDE

2.拍照识别景点页面样式

### 2016年10月18日

实现

1.图片识别结果页面样式

### 2016年10月16日

实现

1.“图片识别”功能

### 2016年10月15日

实现

1.修改后台管理中游客管理和管理员管理的动态加载部分

2.完善游客管理和管理员管理两个页面的样式以及补充左侧菜单的点击事件

### 2016年9月29日

实现

1.重新调整了审核管理员的审核功能，超级管理员和景区管理员回复建议，超级管理员删除和修改管理员功能

2.在控制层，业务层增加了景区管理员相应的包

### 2016年9月13日

实现

1.新增管理员功能中超级管理员只能新增景区管理员或审核管理员

2.新增管理员时，权限字段只能为“s”或"c"

### 2016年9月12日

修改合并之后出现的错误

### 2016年8月18日

实现了：

1.管理员登陆时的删除状态验证，已删除则弹框提示

### 2016年8月13日

实现了：

1.新建超级管理员的管理景点区域管理员、审核管理员页面

2.管理景点区域管理员、审核管理员页面页面实现增加管理员(bootstrap模态框提交)

3.点击删除按钮删除管理员

4.登陆注册的中文编码

5.验证登陆注册是否有发送数据到后台，否则不响应

6.管理员登陆之后通过Account从后台将权限值传给前台写入cookie

7.打开管理景点区域管理员、审核管理员页面和管理游客信息页面时检查cookie中的权限是否为超级管理员,否则跳转到管理员登陆页面

8.添加管理员成功则刷新页面

### 2016年8月10日

实现了:

1:超级管理员和景区管理员回复建议

### 2016年8月8日

实现了：

1.新建超级管理员的管理游客信息页面

2.动态获取数据库中tb_visitor表中的游客信息，在管理游客信息页面显示并分页

3.在管理游客信息页面实现了超级管理员对游客进行冻结或解冻的功能

4.对访问管理游客信息页面进行限制(采用判断cookie是否存在的方式)

5.游客冻结之后的登陆限制

6.导入了管理游客信息页面所需的css、js、asssets、font-awesome

7.表tb_visitor添加Lockstate(冻结状态)字段

8.Dao.java 中添加了参数String Sql，用来从外部传进sql语句

9.将后台返回前台的整型数据定义为final

### 2016年8月7日

实现了：

1.审核管理员的审核功能，和发邮件功能;

2.引进了font-awesome,用来实现小图标

3.导入了发邮件的jar

4.导入了分页所需要的css,和js

5.一个可以用来查询单表和多表的query语句，放在queryDao中

6，导入返回json所需要的jar

### 2016年7月31日

实现了：

1.用户的投诉与建议

2.管理员的登录(新增html)，以及判断管理员身份

3.把boostrap所需的组件引进了css文件包中

### 2016年7月29日

解决了:

1.修改数据库内容，包括了所有id长度改为16、 tb_visitors中的Email改为30，Password改为32

2.导出数据库，并重新整理出数据库.sql(结合王程改表内容)

3.游客Vid 由注册实时时间加一位随数组成

4.登录查询改为用tb_visitorDaoImp.java中的方法实现，将QueryVisitorDao.java删除

5.将所有注释改在所注释内容的上面一行

6.修改了注册service中的逻辑判断

### 2016年7月28日

解决了:

1.确定项目命名规则

2.重新分包与命名

3.实现登录与注册功能

4.注册成功跳转登录页面、 注册失败警告(包括已注册和输入长度溢出)

5.登录注册时对密码进行MD5单向加密

6.以注册的实时时间作为游客Vid存入数据库

7.数据库tb_visitor表新增了Password字段

待解决：

1.登录功能 合并QueryVisitorDao中Sql语句

2.将登录成功后跳转页面的登录按钮替换为用户名

3.补充注册失败所包括的其他情况

4.修改数据库内容，包括了Vid长度改为16、 Email改为30，Password改为32

5.导出数据库，并重新整理出数据库.sql(结合王程改表内容)

### 2016年7月27日

解决readme.txt中文乱码问题

大家尝试用markdown去编辑README.MD这个文件 
