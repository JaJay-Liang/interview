package com.designPatten.Struct.iterator;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    迭代器模式
    迭代器实现类中，用下标的形式标记当前元素，结合fori循环
 */
public class IterartorClient {

    public static void main(String[] args) {
        //list 中的迭代器使用
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        for (int i = 0; i < list.size(); i++) {
//            //下标的形式，遍历中删除？？不得行，下标会变的，因此当前指针也需要指向下一个元素
//            Integer integer = list.get(i);
//            list.remove(integer);
//        }
//
//        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            //可以在迭代器中进行删除元素？原理是什么
            System.out.println(next);

            iterator.remove();

        }
        System.out.println(list);
//
//
        StudentAgImpl s = new StudentAgImpl();
        s.addStu(new Student("1"));
        s.addStu(new Student("2"));
        s.addStu(new Student("3"));
        s.addStu(new Student("4"));
        StudentIterator iterator1 = s.getIterator();
        while (iterator1.hasNext()) {
            Student next = (Student)iterator1.getNext();
            System.out.println(next);
            iterator1.remove();

        }

        System.out.println(s.list);

    }

}

/*
    实现类
 */
class StudentAgImpl implements StudentAg {
    List<Student> list = new ArrayList<>();

    @Override
    public void addStu(Student s) {
        list.add(s);
    }

    @Override
    public void delStu(Student s) {
        list.remove(s);
    }

    @Override
    public StudentIterator getIterator() {
        return new StudentIteratorImpl(list);
    }
}

/*
    抽象聚合角色类，相当于list接口
 */
interface StudentAg {
    void addStu(Student s);

    void delStu(Student s);

    StudentIterator getIterator();

}


/*
    迭代器实现类
 */
@Data
class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int index = 0;//用于记录遍历时的下标
    private int lastRet = -1;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index !=  list.size();
    }

    @Override
    public Student getNext() {
        int i = index;
        index++;
        lastRet = i;//两个指针
        Student student = list.get(lastRet);
        return student;
    }

    @Override
    public void remove() {
        //移除当前遍历的元素
        list.remove(lastRet);
        index = lastRet;
        lastRet = -1;//删除后重置，等getNext的时候再赋值
    }
}


/*
    抽象迭代器
 */
interface StudentIterator<T> {
    boolean hasNext();

    T getNext();

    void remove();
}


@Data
class Student {
    private String name;
    private String age;

    public Student(String n){
        this.name = n;
    }

}

