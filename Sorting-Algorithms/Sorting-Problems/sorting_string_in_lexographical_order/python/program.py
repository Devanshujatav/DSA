import string

class program:
    @staticmethod
    def sortFruits(fruits):
        n = len(fruits)

        for i in range(n-1):
            minIndex = i
            for j in range(i+1 , n):
                if fruits[j] < fruits[j+1]:
                    minIndex = j

            # swap array elements
            temp = fruits[j];
            fruits[j] = fruits[j+1]
            fruits[j+1] = temp

    @ staticmethod
    def main():
        
