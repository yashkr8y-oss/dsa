class Meralist:
    def __init__(self):
        self.size = 1
        self.n = 0
        #creating a c type array eith size = self.size
        self.A = seslf.__make_array(self.size)
    def __make_array(self, capacity):
        #creates a c type array (static, refrential) with size capacity
        return (capacity *c_types.py_object)()  