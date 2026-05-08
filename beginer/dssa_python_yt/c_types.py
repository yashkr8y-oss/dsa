import ctypes#making our own list
class MeraList:
    def __init__(self):
        self.size = 1
        self.n = 0
        # size = how many items it can store 
        # n = how many items it currently have
# Create a cType array with size = self.size
    def __len__(self):
        return self.n
    def append(self, item):
        if self.n == self.size:
            #resize
            self._resize(self.size*2)
    #append
    self.A[self.n] = item
    self.n = self.n + 1
    def _resize(self, new_cpacity):
        B =self.__make_array(new_cpacity)
        self.size = new_cpacity
        # COPY THE CONTENT OF A TO B
        for i in range(self.n):
            B[i] = self.A[i]
        self.A = B

        

        self.A =self.__make_array(self.size)
    def __make_array(self,capacity):
    #Creates a C tpye array(static, refrential) with size capacity
        return (capacity * ctypes.py_object)()

L = MeraList()
L.append('hello')
L.append('hello')
len(L)
print(L)
