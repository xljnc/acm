package com.wt.acm.hdu.page3;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author Xljnc
 * @date 2018/10/18 22:12
 * @description 献给杭电五十周年校庆的礼物.这是个数学题目，推导过程如下
 * 推导过程如下
 * 1.先简化问题
 * 直线分割平面
 * 首先考虑 n条直线最多把平面分成an部分于是a0=1 a1=2 a2=4对于已经有n条直线 将平面分成了最多的an块那么加一条直线 他最多与前n条直线有n个交点 于是被它穿过的区域都被一分为二 那么增加的区域数就是穿过的区域数 也就是这条直线自身被分成的段数 就是n+1 故 a(n+1) = an+n+1an = n+(n-1)+...+2+a1 = n(n+1)/2 +1
 * 2.平面分割空间
 * 设n个平面最多把空间分成bn个部分于是b0=1 b1=2 b2=4对于已经有n个平面 将空间分成了最多的bn块那么加入一个平面 它最多与每个平面相交 在它的上面就会得到至多n条交线 同时被它穿过的空间区域也被它一分为二 那么增加的区域数仍旧是它穿过的区域数 也就是这个平面自身被直线分割成的块数 就是an于是b(n+1)=bn+anbn=a(n-1)+b(n-1)=...=a(n-1)+a(n-2)+...+a1+b1=(n-1)n/2 +(n-2)(n-1)/2+...+1*(1+1)/2+n+2=求和[1方到(n-1)方]/2 + 求和[1到(n-1)]/2 +n+1=n(n-1)(2n-1)/12 +n(n-1)/4 +n+1=n(n+1)(n-1)/6 +n+1=(n^3+5n+6)/6
 * 附：1平方到n平方和求解
 * 利用恒等式(n+1)^3=n^3+3n^2+3n+1）：
 * (n+1)^3-n^3=3n^2+3n+1,
 * n^3-(n-1)^3=3(n-1)^2+3(n-1)+1
 * .
 * 3^3-2^3=3*(2^2)+3*2+1
 * 2^3-1^3=3*(1^2)+3*1+1.
 * 把这n个等式两端分别相加,得：
 * (n+1)^3-1=3(1^2+2^2+3^2+.+n^2)+3(1+2+3+...+n)+n,
 * 由于1+2+3+...+n=(n+1)n/2,
 * 代人上式得：
 * n^3+3n^2+3n=3(1^2+2^2+3^2+.+n^2)+3(n+1)n/2+n
 * 整理后得：
 * 1^2+2^2+3^2+.+n^2=n(n+1)(2n+1)/6
 */
public class Problem1290 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println((n * n * n + 5 * n + 6) / 6);
        }
    }
}
