MapStruct 转dto和vo

do 数据库层
dto用户传输
vo用户展示

service 和action需要生成到相应的service里面，不能生成在mbg里面


u_user  用户

p_product 产品
p_product_comment 商品评论
p_product_comment_reply 商品评论回复


！！ p_product_category 商品后台类目
！！p_category_parameter    分类属性参数
    一个分类它会有很多特有的属性，管理员需要配置系统里面的每个分类有哪些属性。
    name代表他的名字，比如材质；
    icon代表他的图标；
    must代表是否必须填写     
    select_type代表参数的一个选择类型，
        1->文本：代表用户可以输入文本数据；
        2->数字：代表该属性只能输入数字；
        3->单选：代表该属性只能是一个单选的属性；
        4->多选：代表该数据可以选择多个数据。
    value代表可选值，
        参数类型1、2(文本)是为提示语；
        参数类型3(单选)或4(多选)时为可选参数,多个用;隔开 
        
！！p_product_category_parameter_value 用户商品的分类属性参数的值  

p_product_category_property 产品分类属性   ？？

p_category_property 分类规格属性
    分类的规格属性通过欧笛卡尔可以确定一个商品的唯一sku
p_product_category_property_value   用户商品分类规格属性的值
p_sku   商品库存单位

      
系统后台有后台商品分类《p_product_category》，这个是系统固定死的,该后台分类最多三级。
每个商品分类有很多的属性参数《p_category_parameter》，系统后台需要对这些进行配置。
用户在创建商品的时候需要勾选这些填写这些属性参数的值。
        
p_product_user_category 用户的前台分类，可以多级

p_product_nav_category  平台的前台类目，平台可以用来和他对应后台类目关联进行搜索（一个前台类目可以对应多个
后台类目，一个后台类目也可以对应多个前台类目）    
    
b_picture 图片
b_picture_space 图片空间

创建接口，统一修改成传json数据接收。
但是如果前台少传参数，只会报400错误，不会报详细的错误。
需要自定义报错处理。
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.web.servlet.HandlerExceptionResolver]: Factory method 'handlerExceptionResolver' threw exception; nested exception is java.lang.IllegalStateException: Ambiguous @ExceptionHandler method mapped for [class org.springframework.web.bind.MissingServletRequestParameterException]: {public com.sunny.base.ReturnResult com.sunny.base.UnifyExceptionHandler.handleMissingServletRequestParameterException(org.springframework.web.bind.MissingServletRequestParameterException), public final org.springframework.http.ResponseEntity org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler.handleException(java.lang.Exception,org.springframework.web.context.request.WebRequest) throws java.lang.Exception}
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:185) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:651) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	... 24 common frames omitted



哪些接口已经完成开发了
p_category_parameter, 
p_category_property, 
p_product_nav_category,
p_product_user_category, 
p_product_category
哪些接口未开发
p_product_category_parameter_value,
p_product_category_property_value, 

 

p_sku


p_product, 	商品
p_product_category,  商品后台分类
p_product_comment, 	商品评论
p_product_comment_reply, 	商品评论回复



//todo   平台可以创建商品的服务ID

