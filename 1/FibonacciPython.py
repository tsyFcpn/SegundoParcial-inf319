# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
def fibo(n):
   if n <= 1:
       return n
   else:
       return(fibo(n-1) + fibo(n-2))
        
for i in range(int(input())):
    print(fibo(i))