const fragmentShaderSource =
  `
  precision mediump float;

  // our texture
  uniform sampler2D u_image;
  uniform vec2 u_textureSize;
  uniform vec2 u_color;
  
  // the texCoords passed in from the vertex shader.
  varying vec2 v_texCoord;
  
  void main() {
     vec2 onePixel = vec2(1.0, 1.0) / u_textureSize;
     gl_FragColor = texture2D(u_image, v_texCoord).gbra;
  }
`;