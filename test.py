import cudf

pattern = "TEST$"
data = cudf.Series(['TEST', 'TEST\n', 'TEST\x85', 'TEST\x85\n', 'TEST\n\x85'])

print(data.str.contains(pattern, regex=True))


