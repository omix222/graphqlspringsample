# GraphQLのサンプルアプリ

## アクセス手順
 - 以下にアクセスすると、GraphiQLで試すことができる。
 - http://localhost:8080/graphiql

## 参考にしたもの
 - https://kntmr.hatenablog.com/entry/2018/10/16/100104

## サンプル電文

- query(参照)
  
```
query {
  getUser(id: 2) {
    id
    name
    group {
      id
      name
    }
  }
}
```
- mutation
  
```
mutation {
  add(todo: {
    content: "New content!"
    completed: false
    userId: 1
  }) {
    id
    content
    completed
  }
}
```

- F12でみるとわかるが、queryでもmutation でもリクエスト電文はPOSTで上記の内容を送信しているだけ

```
query	query { getUser(id: 2) { id name group { id name } } }
variables	null
```