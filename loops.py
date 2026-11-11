list=[10,20,30,40,50]
for i in list:
    if i%2==0:
        print(f'{i} is a even number')
    else:
        print(f'{i} is a odd number')



num=123456789
for digit in str(num):
    digit=int(digit)
    if digit%2==0:
        print(f'{digit} is a even number')
    else:
        print(f'{digit} is a odd number')
    