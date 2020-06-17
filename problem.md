MapStruct 转dto和vo

do 数据库层
dto用户传输
vo用户展示

service 和action需要生成到相应的service里面，不能生成在mbg里面


u_user  用户

product 产品
product_category 产品分类
product_property 产品属性
product_property_value 产品属性值
product_category_property 产品分类属性
product_comment 商品评论
p_product_comment_reply 商品评论回复
p_category_parameter    分类属性参数
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
p_product_category_parameter_value 分类属性参数用户值

p_category_property 分类规格属性
    分类的规格属性通过欧笛卡尔可以确定一个商品的唯一sku
p_product_category_property_value   商品分类规格属性值
p_sku   商品库存单位
      
        
    
    
b_picture 图片
b_picture_space 图片空间


