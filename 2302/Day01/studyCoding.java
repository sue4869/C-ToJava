package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int x=0;x<M;x++) {

            if(binarySearch(Integer.parseInt(st2.nextToken())) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }


    }

    public static int binarySearch(int num) {
        int leftEnd = 0;
        int rightEnd = arr.length -1;

        while(leftEnd <= rightEnd) {
            int mid = (leftEnd + rightEnd)/2;

            if(num < arr[mid]) {
                rightEnd = mid - 1;
            } else if(num > arr[mid]) {
                leftEnd = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
