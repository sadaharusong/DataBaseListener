# DataBaseListener
This is a simple DataBaseListener

You can use this listener to listen you DataBase when it change.

> * Create a listener and set it , to do want you want to do when database change.
```java
mDataBaseListener = new DataBaseListener(this,Uri.EMPTY);
mDataBaseListener.setOnDataBaseListener(new DataBaseListener.onDataBaseListener() {
    @Override
    public void onDataBaseChange() {
        // TODO: To Do Want You Want Do
    }
});
```   

> * Remove the listener when you don't want listener the database.
```java
mDataBaseListener.removeOnDataBaseListener();
``` 

------
这是一个简单的数据库监听器

你可以用这个监听器去监听你的数据库变化。

> * 创建监听器然后设置监听器，在里面设置当数据库变化时你需要做的事情。
```java
mDataBaseListener = new DataBaseListener(this,Uri.EMPTY);
mDataBaseListener.setOnDataBaseListener(new DataBaseListener.onDataBaseListener() {
    @Override
    public void onDataBaseChange() {
        // TODO: To Do Want You Want Do
    }
});
```   

> * 当你不需要监听数据库的时候，移除监听器。
```java
mDataBaseListener.removeOnDataBaseListener();
``` 
