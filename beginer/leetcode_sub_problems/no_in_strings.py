def Number_to_words(nums):
    #agar nums 0 hai to return zero

    # ones ke lye like one, two, three...
    ones = ["", "one", "two", "three", "Four", "five", "six", "seven", "Eight", "Nine"]

    #tens ke liye ten, twenty, thirty,...
    tens = ["", "ten","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "ninety"]
    #but hre is a catch when we run in ten to twenty numbers then we just need to make anew like in twenties forlets do it then
    twenty = ["", "eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"]
def convert(n):
    if n == 0:
        return"zero"
    elif n <10:
        return ones[n]
    elif n < 20:
        return twenty[n]
    elif n<100:
        return tens[n//10] + "hundred" + ones[n % 10]
    else:
        return (ones[n // 100]+"hundred" + ("" + convert(n % 100) if n % 100 else ""))
parts = {
    10**9 = "Million"
    10**
}