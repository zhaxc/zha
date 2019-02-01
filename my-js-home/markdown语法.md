# Markdown 基本语法

# 一、标题
eg:
# 这是一级标题
## 这是二级标题
### 这是三级标题
#### 这是四级标题
##### 这是五级标题
###### 这是六级标题
# 二、字体
## 加粗
要加粗的文字左右分别用两个*号包起来
## 斜体
要倾斜的文字左右分别用一个*号包起来
## 斜体加粗
要倾斜和加粗的文字左右分别用三个*号包起来
## 删除线
要加删除线的文字左右分别用两个~~号包起来

eg:

**这是加粗的文字**

*这是倾斜的文字*

***这是斜体加粗的文字***

~~这是加删除线的文字~~

# 三、引用
在引用的文字前加>即可。引用也可以嵌套，如加两个>>三个>>>
n个...
貌似可以一直加下去，但没神马卵用

eg:

>这是引用的内容
>>这是引用的内容
>>>>>>>>>>这是引用的内容

# 四、分割线

三个或者三个以上的 - 或者 * 都可以。

---
----
***
*****

# 五、图片

语法:

![图片alt](图片地址 ''图片title'')

图片alt就是显示在图片下面的文字，相当于对图片内容的解释。
图片title是图片的标题，当鼠标移到图片上时显示的内容。title可加可不加

eg:

![blockchain](https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=702257389,1274025419&fm=27&gp=0.jpg "区块链")
![dss](./img/eye.png "小黄人")

# 六、超链接

[简书](http://jianshu.com)

[百度](http://www.baidu.com)

<a href="https://www.jianshu.com/u/1f5ac0cf6a8b" target="_blank">简书</a>

# 七、列表

## 1.无序列表

语法：
无序列表用 - + * 任何一种都可以

eg:

- 列表内容
+ 列表内容
* 列表内容

注意：- + * 跟内容之间都要有一个空格


## 2.有序列表

语法：
数字加点

eg:
 
1. 列表内容
2. 列表内容
3. 列表内容

注意：序号跟内容之间要有空格

## 3.列表嵌套

上一级和下一级之间敲三个空格即可

eg:

- 一级无序列表内容
   - 二级无序列表内容
   - 二级无序列表内容
   - 二级无序列表内容
- 一级无序列表内容
   1. 二级有序列表内容
   2. 二级有序列表内容
   3. 二级有序列表内容
   

# 八、表格

表头|表头|表头
---|:---:|---:
内容|内容|内容
内容|内容|内容

第二行分割表头和内容。
- 有三个个就行
文字默认居左
-两边加：表示文字居中
-右边加：表示文字居右
注：原生的语法两边都要用 | 包起来。此处省略

eg:

姓名|技能|排行
:---:|:---:|---:
刘备|哭|大哥
关羽|打|二哥
张飞|骂|三弟

<table>
  <tr>
    <th width=10%, bgcolor=yellow >参数</th>
    <th width=40%, bgcolor=yellow>详细解释</th>
    <th width="50%", bgcolor=yellow>备注</th>
  </tr>
  <tr>
    <td bgcolor=#eeeeee> -l </td>
    <td> use a long listing format  </td>
    <td> 以长列表方式显示（显示出文件/文件夹详细信息）  </td>
  </tr>
  <tr>
    <td bgcolor=#00FF00>-t </td>
    <td> sort by modification time </td>
    <td> 按照修改时间排序（默认最近被修改的文件/文件夹排在最前面） </td>
  <tr>
    <td bgcolor=rgb(0,10,0)>-r </td>
    <td> reverse order while sorting </td>
    <td>  逆序排列 </td>
  </tr>
</table>

# 九、代码

语法：
单行代码：代码之间分别用一个反引号包起来
`create database hero;`

代码块：代码之间分别用三个反引号包起来，且两边的反引号单独占一行

```
    function fun(){
         echo "这是一句非常牛逼的代码";
    }
    fun();
```


# 十、流程图

```flow
st=>start: 开始
op=>operation: My Operation
cond=>condition: Yes or No?
e=>end
st->op->cond
cond(yes)->e
cond(no)->op&``` 
   
   
   

