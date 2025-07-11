package LinkedList;

import java.lang.classfile.components.ClassPrinter;

public class partitionList {

        public ClassPrinter.ListNode partition(ListNode head, int x) {
            ListNode lessX = new ListNode(0);
            ListNode moreX = new ListNode(0);

            ListNode less = lessX;
            ListNode more = moreX;

            while(head!=null){
                if(head.val <x){
                    less.next =head;
                    less = less.next;
                }else{
                    more.next = head;
                    more = more.next;
                }
                head = head.next;
            }
            more.next = null;
            less.next = moreX.next;

            return lessX.next;
        }
    }

