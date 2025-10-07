package org.devanshu.code.Practice.PalindromicLinkedList;

import static org.devanshu.code.Practice.PalindromicLinkedList.CheckPalindrome.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EXAMPLE 1: PALINDROME LIST ===");

        // Create palindrome list: 1 ⇄ 2 ⇄ 3 ⇄ 2 ⇄ 1
        CheckPalindrome.Node a = new CheckPalindrome.Node(1);
        CheckPalindrome.Node b = new CheckPalindrome.Node(2);
        CheckPalindrome.Node c = new CheckPalindrome.Node(3);
        CheckPalindrome.Node d = new CheckPalindrome.Node(2);
        CheckPalindrome.Node e = new CheckPalindrome.Node(1);

        // Link nodes forward
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Link nodes backward
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;

        displayForward(a);
        displayBackward(a);

        boolean result1 = isPalindrome(a);
        System.out.println("Is Palindrome? " + (result1 ? "✅ YES" : "❌ NO"));

        System.out.println("\n=== EXAMPLE 2: NON-PALINDROME LIST ===");

        // Create non-palindrome list: 10 ⇄ 20 ⇄ 30 ⇄ 40
        CheckPalindrome.Node f = new Node(10);
        Node g = new Node(20);
        Node h = new Node(30);
        Node i = new Node(40);

        // Link nodes forward
        f.next = g;
        g.next = h;
        h.next = i;

        // Link nodes backward
        g.prev = f;
        h.prev = g;
        i.prev = h;

        displayForward(f);
        displayBackward(f);

        boolean result2 = isPalindrome(f);
        System.out.println("Is Palindrome? " + (result2 ? "✅ YES" : "❌ NO"));

        System.out.println("\n=== EXAMPLE 3: EVEN LENGTH PALINDROME ===");

        // Create even length palindrome: 5 ⇄ 10 ⇄ 10 ⇄ 5
        Node j = new Node(5);
        Node k = new Node(10);
        Node l = new Node(10);
        Node m = new Node(5);

        // Link nodes forward
        j.next = k;
        k.next = l;
        l.next = m;

        // Link nodes backward
        k.prev = j;
        l.prev = k;
        m.prev = l;

        displayForward(j);
        displayBackward(j);

        boolean result3 = isPalindrome(j);
        System.out.println("Is Palindrome? " + (result3 ? "✅ YES" : "❌ NO"));

        System.out.println("\n=== EXAMPLE 4: SINGLE NODE ===");

        Node single = new Node(7);
        displayForward(single);

        boolean result4 = isPalindrome(single);
        System.out.println("Is Palindrome? " + (result4 ? "✅ YES" : "❌ NO"));
    }
}
