import cudf

pattern = "TEST\\Z"
data = ['TEST', 'TEST\n', 'TEST\x85', 'TEST\x85\n', 'TEST\n\x85']

data = cudf.Series(data)
print(data.str.contains(pattern, regex=True))


