class SimpleHashMap:
    def __init__(self, size=100):
        # Number of buckets
        self.size = size

        # Create a list of empty buckets
        self.buckets = [[] for _ in range(size)]

    def hash_function(self, key):
        # Convert the key into a bucket index
        numeric_sum = sum(int(char) for char in key if char.isdigit())
        return numeric_sum % self.size

    def put(self, key, value):
        # Find the correct bucket
        index = self.hash_function(key)
        bucket = self.buckets[index]

        # Check if the key already exists
        for i, (k, v) in enumerate(bucket):
            if k == key:
                # Update the existing value
                bucket[i] = (key, value)
                return

        # If key doesn't exist, add a new (key, value) pair
        bucket.append((key, value))

    def get(self, key):
        # Find the correct bucket
        index = self.hash_function(key)
        bucket = self.buckets[index]

        # Search for the key
        for k, v in bucket:
            if k == key:
                return v

        # Key not found
        return None

    def remove(self, key):
        # Find the correct bucket
        index = self.hash_function(key)
        bucket = self.buckets[index]

        # Search for the key and delete it
        for i, (k, v) in enumerate(bucket):
            if k == key:
                del bucket[i]
                return

    def print_map(self):
        print("Hash Map Contents:")
        for index, bucket in enumerate(self.buckets):
            print(f"Bucket {index}: {bucket}")
hash_map = SimpleHashMap(size = 10)
hash_map.put("123-4567", "Charlotte")
hash_map.put("123-4568", "Yash")
