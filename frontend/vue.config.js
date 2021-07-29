module.exports = {
    devServer: {
      https: false,
      port: 8083,
      open: true,
      proxy: {
        '/api/v1': {
          target: 'http://localhost:8080/'
        },
        '/api/v2': {
          target: 'http://localhost:8080/'
        },
        '/groupcall': {
          target: 'http://localhost:8080/'
        },
        '/upload': {
          target: 'http://localhost:8080/'
        },
      },
      historyApiFallback: true,
      hot: true
    },
    css: {
      requireModuleExtension: false // import 시에 경로에 .module 포함 안해도 됨.
    },
    lintOnSave: false,
    outputDir: '../backend/src/main/resources/dist',
  }
  